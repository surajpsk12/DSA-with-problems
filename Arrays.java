
/*
## 🔰 What is an Array in Java?

An **array** is a collection of similar types of elements stored in **contiguous memory locations**. It’s **fixed in size** and **indexed from 0**.

int[] numbers = new int[5];  // Creates an array of size 5
```

---

## ✅ How to Declare and Initialize Arrays


// Declaration
int[] arr1;
int arr2[];

// Initialization
arr1 = new int[3];  // size 3, default values = 0

// Declaration + Initialization
int[] arr = {10, 20, 30};  // size 3
```

---

## 🔁 Traversing the Array (Looping)


for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// OR using enhanced for loop
for (int value : arr) {
    System.out.println(value);
}
```

---

## 🔄 CRUD Operations in Array

### 1️⃣ **Create (Insert)**

You can insert elements while initializing or by assigning:


int[] arr = new int[5];
arr[0] = 10;
arr[1] = 20;
// And so on
```

Java arrays have fixed size, so you **cannot expand** them. If full, you’ll need to create a new array with a larger size.

---

### 2️⃣ **Read (Accessing Elements)**

Access using index:


System.out.println(arr[1]);  // Output: 20
```

---

### 3️⃣ **Update (Modify Elements)**

Just reassign a value at a particular index:

arr[1] = 25;  // Now arr[1] is 25
```

---

### 4️⃣ **Delete**

You can’t really “delete” an element in a fixed-size array, but you can:

* Set its value to a default (like 0)
* Shift all elements to remove a gap (manually)

// Deleting arr[1]
for (int i = 1; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
arr[arr.length - 1] = 0;  // Set last as 0 or default


Example Program with All CRUD
public class ArrayCRUD {
    public static void main(String[] args) {
        // Create
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Read
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Update
        arr[2] = 35;
        System.out.println("\n\nAfter Updating index 2:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Delete (remove arr[1])
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;  // Set last to 0

        System.out.println("\n\nAfter Deleting index 1:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


*/