#include <stdio.h>
#include <conio.h>

int i, j, nof, nor, flag = 0, ref[50], frm[50], pf = 0, victim = -1;
int recent[10], lrucal[50], count = 0;
int lruvictim();
int main()
{
    printf("LRU PAGE REPLACEMENT ALGORITHM");
    printf("\nEnter no.of frames: ");
    scanf("%d", &nof);
    printf("Enter no.of reference string: ");
    scanf("%d", &nor);
    printf("Enter reference string: ");
    for (i = 0; i < nor; i++)
        scanf("%d", &ref[i]);
    printf("LRU PAGE REPLACEMENT ALGORITHM \n");
    printf("The given reference string: ");
    for (i = 0; i < nor; i++)
        printf("%4d", ref[i]);
    // printf("\n");

    for (i = 0; i < nof; i++)
    {
        frm[i] = -1;
        lrucal[i] = 0;
    }
    for (i = 0; i < 10; i++)
        recent[i] = 0;

    for (i = 0; i < nor; i++)
    {
        flag = 0;
        printf("\nReference NO %d->\t", ref[i]);
        for (j = 0; j < nof; j++)
        {
            if (frm[j] == ref[i])
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            count++;
            if (count <= nof)
                victim++;
            else
                victim = lruvictim();
            pf++;
            frm[victim] = ref[i];
        }
        recent[ref[i]] = i;
        for (j = 0; j < nof; j++)
            printf("%4d", frm[j]);
    }
    printf("\nNo.of page faults...%d\n", pf);
    return 0;
}

int lruvictim()
{
    int i, j, temp1, temp2;
    for (i = 0; i < nof; i++)
    {
        temp1 = frm[i];
        lrucal[i] = recent[temp1];
    }
    temp2 = lrucal[0];
    for (j = 1; j < nof; j++)
    {
        if (temp2 > lrucal[j])
            temp2 = lrucal[j];
    }
    for (i = 0; i < nof; i++)
    {
        if (recent[frm[i]] == temp2)
            return i;
    }
    return 0;
}