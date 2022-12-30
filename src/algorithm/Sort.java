//package algorithm;

//public class Sort {


//    long executionTime = 0;

//*    public static void main(String[] args) {
      /*  private int i;



        /*
         * Please implement all the sorting algorithm. Feel free to add helper methods.
         * Store all the sorted data into one of the databases.
         */


     /*   public int[] selectionSort ( int[] array){
            final long startTime = System.currentTimeMillis();
            int[] list = array;

            for (int j = 0; j < array.length - 1; j++) {
                int min = j;
                for (int i = j + 1; i < array.length; i++) {
                    if (array[i] < array[min])
                        min = i;
                }

                int temp = array[min];
                array[min] = array[j];
                array[j] = temp;
            }

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }


        public int[] insertionSort ( int[] array){
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            //implement here

            for (int j = 1; j < array.length - 1; j++) {
                int curr = j;
                j = i;

                while (j > 0 && curr < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = curr;
            }


            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }

        public int[] bubbleSort ( int[] array){
            int[] list = array;
            //implement here

            int n = list.length;

            int temp = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {

                    if (list[j - 1] > list[j]) {

                        temp = list[j - 1];
                        list[j - 1] = list[j];
                        list[j] = temp;
                    }
                }
            }

            return list;
        }


        public int[] mergeSort ( int[] array){
            int[] list = array;
            //implement here

            if (list == null) {
                return list;
            }
            if (list.length > 1) {

                int mid = list.length / 2;


                int[] left = new int[mid];
                for (int i = 0; i < mid; i++) {
                    left[i] = list[i];
                }

                int[] right = new int[list.length - mid];
                for (int i = mid; i < list.length; i++) {
                    right[i - mid] = list[i];
                }
                mergeSort(left);
                mergeSort(right);

                int i = 0;
                int j = 0;
                int k = 0;


                while (i < left.length && j < right.length) {
                    if (left[i] < right[j]) {
                        list[k] = left[i];
                        i++;
                    } else {
                        list[k] = right[j];
                        j++;
                    }
                    k++;
                }

                while (i < left.length) {
                    list[k] = left[i];
                    i++;
                    k++;
                }
                while (j < right.length) {
                    list[k] = right[j];
                    j++;
                    k++;
                }
            }


            return list;
        }


        public int[] quickSort ( int[] array){

            int[] list = array;
            //implement here

            int n = list.length;
            int h = n - 1;
            int l = 0;

            int[] stack = new int[h - l + 1];


            int top = -1;


            stack[++top] = l;
            stack[++top] = h;


            while (top >= 0) {
                // Pop h and l
                h = stack[top--];
                l = stack[top--];


                int p = partition(list, l, h);


                if (p - 1 > l) {
                    stack[++top] = l;
                    stack[++top] = p - 1;
                }


                if (p + 1 < h) {
                    stack[++top] = p + 1;
                    stack[++top] = h;
                }
            }


            return list;
        }

        private int partition ( int[] list, int l, int h){
            return l;
        }


        public int[] heapSort ( int[] array){

            int[] list = array;
            //implement here


            buildMaxHeap(list);
            // fetching length of list
            int n = list.length;
            int temp;

            for (int i = n - 1; i > 0; i--) {

                temp = list[0];
                list[0] = list[i];
                list[i] = temp;


                int j = 0, index;

                do {
                    index = (2 * j + 1);

                    if (index < (i - 1) && list[index] < list[index + 1])
                        index++;


                    if (index < i && list[j] < list[index]) {
                        temp = list[j];
                        list[j] = list[index];
                        list[index] = temp;
                    }

                    j = index;

                } while (index < i);
            }


            return list;
        }

        private void buildMaxHeap ( int[] list){
        }






   /* public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }*/


