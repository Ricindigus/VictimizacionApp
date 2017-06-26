package pe.gob.inei.victimizacionapp;

/**
 * Created by RICARDO on 25/06/2017.
 */
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResidenteAdapter extends RecyclerView.Adapter<ResidenteAdapter.ViewHolder>{
    private Context contexto;
    private ArrayList<ResidenteHogar> residentes;

    public ResidenteAdapter(Context contexto, ArrayList<ResidenteHogar> residentes) {
        this.contexto = contexto;
        this.residentes = residentes;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.residente_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.numero.setText(String.valueOf(residentes.get(position).getN()));
        holder.nombres.setText(residentes.get(position).getNombres());
        holder.apellidos.setText(residentes.get(position).getApellidos());
        holder.parentezco.setText(residentes.get(position).getParentezco());
//        holder.imgBasura.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                notas.remove(position);
//                notifyDataSetChanged();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return residentes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView numero, nombres, apellidos, parentezco;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cardview_residente);
            numero = (TextView)itemView.findViewById(R.id.residente_numero);
            nombres = (TextView)itemView.findViewById(R.id.residente_nombres);
            apellidos = (TextView)itemView.findViewById(R.id.residente_apellidos);
            parentezco = (TextView)itemView.findViewById(R.id.residente_parentezco);
        }
    }
}
