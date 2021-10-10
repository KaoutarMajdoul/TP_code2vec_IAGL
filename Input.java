int f(int n) {
    if (n == 0) {
        return 1; 
    } else {
        return n * f(n-1);
    }
}

/* FONCTION CONTAINS
boolean f(Object target) {
    for (Object elem: this.elements) {
        if (elem.equals(target)) {
            return true;
        }
    }
    return false;
}


/*
// *//*
 FONCTION REVERSE ARRAY


// String[] f(final String[] array) {
//     final String[] newArray = new String[array.length];
//
//     for (int index = 0; index < array.length; index++) {
//         newArray[array.length - index - 1] = array[index];
//     }
//     return newArray;
// } */
