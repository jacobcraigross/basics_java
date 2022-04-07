public class fibonacci {
    public static void main(String[] args) {
        // fibonacci sequence.
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        for (int i = 2; i < 20; i++) {
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
}

/*
some notes...

start by declaring three starter variables. 0, 1 and their sum, which is 1. (0 + 1) = 1

we start the for loop at 2 because above we have already assigned / started at 1

set the loop as high as you want to go, in this case 20 and loop fwd (i++)

so like we said the sum is starting with 0 + 1, so the sum is 1. (sum = n1 + n2)

then we print the sum, which to start is 1. (0 + 1)

now we set n1 = n2 --> this is like moving along the chain. 0 --> 1 --> etc.

n2 becomes the sum and as you can see this keeps compounding until we get big fibonacci numbers.

the loop just keeps doing this until we hit that target number declared in the loop. (in this case 20)

 */
