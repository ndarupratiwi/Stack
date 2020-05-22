package e31192403_stack;

/**
 *
 * @author Ndaru Pratiwi
 */
class Takjil {

    String urutan;//variable urutan tipe data string
    Takjil prev, next;// urutan menyimpan prev dan next dengan tipe data takjil di class takjil

    Takjil(String j) {
        urutan = j;//urutan replace/berisi nilai dari j
        System.out.println("Takjil " + j + " dibuat");//print/cetak urutan takjil yang dibuat
    }
}

class Stack {

    Takjil top, bottom;// inisialisasi top dan bottom dengan tipe data takjil di class stack
    int jumlah, maks;//variabel jumlah dan maks bertipe data integer

    Stack(int m) {
        maks = m;//maks replace/berisi nilai dari m
        System.out.println("Stack " + m + " dibuat");//print/cetak  stack maks yang dibuat
    }

    void push(String j) {// method simpan atau tambah dari urutan depan
        if (jumlah < maks) {// percabangan if jika belum penuh atau jumlah < maks
            Takjil baru = new Takjil(j);//stack baru jika belum penuh
            if (top == null) {// percabangan if apakah nilai awal/top sama dengan kosong
                top = bottom = baru;//jika if bernilai true maka scrip ini digunakan untuk me replace top berisi nilai baru
            } else {
                baru.next = top;//jika percabangan if (top == null) bernilai false maka scrip ini digunakan untuk menghubungkan baru selanjutnya dengan top
                top.prev = baru;//kemudian  top sebelumnya dihubungan dengan baru
                top = baru;//top replace/berisi nilai dari baru
            }
            jumlah++;//jumlah increment
            tampil();//menampilkan hasil push/simpan/tambah
        } else {
            System.out.println("Stack sudah penuh");//jika if(jumlah < maks) bernilai salah maka akan menampilkan perintah println "Stack sudah penuh"
        }

    }

    void tampil() {//method tampil untuk menampilkan isi dari stack
        System.out.println("Isi Stack : ");//print/cetak "Isi Stack :"
        for (Takjil i = top; i != null; i = i.next) {//perulangan  untuk menampilkan urutan stack
            System.out.println("Takjil " + i.urutan);//print/cetak takjil sesuai urutan perulangan
        }
    }

    void pop() {// method hapus bagian depan
        if (jumlah > 0) {// percabangan jika jumah lebih dari 0
            Takjil temp = top;// jika if bernilai true maka temp replace/berisi nilai top dengan tipe data Takjil
            if (top.next == null) {// percabangan jika top.next sama dengan kosong(data selanjutnya sama dengan kosong) 
                top = bottom = null;//jika if bernilai true maka stack tinggal 1
            } else {
                top = top.next;//digunakan untuk memindahkan/replace  top ke bagian top selanjutnya
                top.prev = null;//menghapus data sebelumnya atau top.prev dan mengubah menjadi kosong
                temp.next = null;//menghapus data terakhir dan mengubah/replace menjadi kosong
            }
            jumlah--;//jumlah decrement
            tampil();// menampilkan hasil pop/hapus
        } else {
            System.out.println("Sudah kosong");//jika jumlah kurang dari 0 maka cetak/print perintah "Sudah Kosong"
        }
    }
}

public class E31192403_Stack {

    public static void main(String[] args) {
        Takjil takjil = new Takjil("1");// membuat object baru Takjil dengan takjil digunakan untuk memanggil fungsi lain
        Stack s = new Stack(5);//membuat object baru Stack dengan s digunakan untuk memanggil fungsi push dan pop
        s.push("2");s.push("3");s.push("4");s.push("5");s.push("6");//scrip untuk menyimpan atau tamabh
        s.pop();s.pop();s.pop();s.pop();s.pop();s.pop();//scrip untuk menghapus
    }

}
