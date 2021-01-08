package www.starcom.com.jualanpraktis.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;

import www.starcom.com.jualanpraktis.Login.Pref;
import www.starcom.com.jualanpraktis.R;
import www.starcom.com.jualanpraktis.feature.akun.RincianStatusTransaksiActivity;
import www.starcom.com.jualanpraktis.model.ListStatusTransaksi;

public class StatusTransaksiAdapter extends RecyclerView.Adapter<StatusTransaksiAdapter.StatusTransaksiViewHolder> {

    Context context;
    ArrayList<HashMap<String, String>> listStatusTransaksi = new ArrayList<>();
    private Pref pref;

    public StatusTransaksiAdapter(Context context, ArrayList<HashMap<String, String>> listStatusTransaksi) {
        this.context = context;
        this.listStatusTransaksi = listStatusTransaksi;
    }

    @NonNull
    @Override
    public StatusTransaksiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_status_transaksi, parent, false);
        return new StatusTransaksiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusTransaksiViewHolder holder, int position) {
        HashMap<String, String> item = new HashMap<>();
        item = this.listStatusTransaksi.get(position);
        pref = new Pref(context.getApplicationContext());

//        String url = listStatusTransaksi[position].getImage();
//        Glide.with(context)
//                .load(url)
//                .into(holder.imgBarang);

        holder.txtId.setText(item.get("id_transaksi"));
        holder.txtTanggal.setText(item.get("tanggal"));
        holder.txtNama.setText(item.get("nama_produk"));
        holder.txtVariasi.setText(item.get("variasi"));
        holder.txtHargaJual.setText(item.get("harga_jual"));
        holder.txthargaProduk.setText(item.get("harga_produk"));
        holder.txtKeuntungan.setText(item.get("untung"));
        holder.txtStatus.setText(item.get("status_pesanan"));

//        holder.linearProdukLain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, RincianStatusTransaksiActivity.class);
//                intent.putExtra(RincianStatusTransaksiActivity.ExtraId, listStatusTransaksi[position].getId());
//                intent.putExtra(RincianStatusTransaksiActivity.ExtraTanggal, listStatusTransaksi[position].getTanggal());
//                intent.putExtra(RincianStatusTransaksiActivity.ExtraStatus, listStatusTransaksi[position].getStatus_pesanan());
//                intent.putExtra(RincianStatusTransaksiActivity.ExtraImage, listStatusTransaksi[position].getImage());
//                intent.putExtra(RincianStatusTransaksiActivity.ExtraNama, listStatusTransaksi[position].getNama_barang());
//                context.startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return (null != listStatusTransaksi ? listStatusTransaksi.size() : 0);
    }

    public class StatusTransaksiViewHolder extends RecyclerView.ViewHolder {

        ImageView imgBarang;
        LinearLayout linearProdukLain;
        TextView txtId, txtTanggal, txtNama, txtVariasi, txthargaProduk, txtHargaJual, txtKeuntungan, txtStatus;

        public StatusTransaksiViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBarang = itemView.findViewById(R.id.img_list_gambar_status_transaksi);
            linearProdukLain = itemView.findViewById(R.id.linear_list_produk_lain_status);
            txtId = itemView.findViewById(R.id.text_list_id_status_transaksi);
            txtTanggal = itemView.findViewById(R.id.text_list_tanggal_status_transaksi);
            txtNama = itemView.findViewById(R.id.text_list_nama_status_transaksi);
            txtVariasi = itemView.findViewById(R.id.text_list_variasi_status_transaksi);
            txthargaProduk = itemView.findViewById(R.id.text_list_hargaproduk_status_transaksi);
            txtHargaJual = itemView.findViewById(R.id.text_list_hargajual_status_transaksi);
            txtKeuntungan = itemView.findViewById(R.id.text_list_keuntungan_status_transaksi);
            txtStatus = itemView.findViewById(R.id.text_list_status_transaksi);
        }
    }
}
