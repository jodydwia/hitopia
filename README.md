# hitopia

hitopia - problem solving test

Kompleksitas dari kode soal no 2 adalah sebagai berikut:

Kompleksitas Waktu:

- Kode tersebut melakukan iterasi melalui setiap karakter dalam array brackets tepat satu kali. Dalam setiap iterasi, hanya satu operasi push atau pop dilakukan pada stack.

- Jika panjang array brackets adalah n, maka jumlah iterasi yang dilakukan oleh fungsi isBalanced adalah n.

- Setiap iterasi memiliki kompleksitas waktu konstan karena hanya melakukan operasi push atau pop pada stack.

- Oleh karena itu, kompleksitas waktu dari fungsi isBalanced adalah O(n).

Kompleksitas Ruang:

- Kompleksitas ruang dipengaruhi oleh penggunaan stack dan ukuran input.

- Stack digunakan untuk menyimpan tanda kurung yang belum dipasangkan.

- Jika semua tanda kurung pembukaan diikuti oleh tanda kurung penutup yang sesuai, maka stack akan memiliki ukuran maksimum yang sama dengan jumlah tanda kurung pembukaan yang belum dipasangkan.

- Dalam skenario terburuk, stack dapat mencapai ukuran n (jika semua tanda kurung adalah tanda kurung pembukaan).

- Oleh karena itu, kompleksitas ruang dari fungsi isBalanced adalah O(n).

Dengan demikian, kompleksitas waktu dari fungsi isBalanced adalah O(n) dan kompleksitas ruangnya adalah O(n), di mana n adalah panjang array brackets.
