package dev.friday.lowpoo.entity.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class Itens {
    List<String> sulfatosFortes = new ArrayList<>();
    List<String> sulfatosFracos = new ArrayList<>();
    List<String> siliconesInsoluveis = new ArrayList<>();
    List<String> siliconesSoluveis = new ArrayList<>();
    List<String> agentesLimpeza = new ArrayList<>();
    List<String> oleoMineral = new ArrayList<>();

    public List<String> getSulfatosFortes() {
        sulfatosFortes.add("Sodium Laureth Sulfate");
        sulfatosFortes.add("Sodium Lauryl Sulfate");
        sulfatosFortes.add("Sodium Lauryl Ether Sulfate");
        sulfatosFortes.add("Sodium Myreth Sulfate");
        sulfatosFortes.add("Sodium Coco Sulfate");
        sulfatosFortes.add("Sodium Trideceth Sulfate");
        sulfatosFortes.add("Ammonium Lauryl Sulfate");
        sulfatosFortes.add("Ammonium Laureth Sulfate");
        sulfatosFortes.add("Ammonium Lauryl Ether Sulfate");
        sulfatosFortes.add("Sodium C14-16 Olefin Sulfonate");
        sulfatosFortes.add("Sodium C12-14 Olefin Sulfonate");
        sulfatosFortes.add("Sodium  Myristyl Sulfate");
        sulfatosFortes.add("TEA Lauryl Sulfate");
        sulfatosFortes.add("TEA Dodecylbenzenesulfonate");
        sulfatosFortes.add("Sodium Alkybenzene Sulfonate");
        sulfatosFortes.add("Sodium coco/cocoyl sulfate");
        sulfatosFortes.add("Sodium Xylenefulfonate");
        sulfatosFortes.add("Ammonium Xylenesulfonate");
        sulfatosFortes.add("Sodium Cocoglyceryl Ether Sufonate");
        sulfatosFortes.add("Sodium Trydeceth Sulfate");
        return sulfatosFortes;
    }

    public List<String> getSulfatosFracos() {
        sulfatosFracos.add("Sodium Cocyk Isethionate");
        sulfatosFracos.add("Sodium Cococyl Glutamate");
        sulfatosFracos.add("Sodium  Lauryl Sarcosinate");
        sulfatosFracos.add("Sodium Lauryl Sulfoacetate");
        sulfatosFracos.add("Sodium Socoyl Sarcosinate");
        sulfatosFracos.add("Sodium Lauryl Sarcosinate");
        sulfatosFracos.add("Sodium Lauroyl Sarcosinate");
        sulfatosFracos.add("Sodium Lauroyl Methyl Isethionate");
        sulfatosFracos.add("Disodium Laureth Sulfocinate");
        sulfatosFracos.add("Disodium Lauryl Sarcosinate");
        sulfatosFracos.add("Sodium Lauryl Glucose Cartboxylate");
        sulfatosFracos.add("Sodium Methyl 2-sulfolaurate");
        sulfatosFracos.add("Disodium Sulfolaurete");
        sulfatosFracos.add("Sodium Methyl Cocoyl Glycerinate");
        sulfatosFracos.add("Ethyl PEG-15 Cocamine Sulfate");
        sulfatosFracos.add("Dioctyl Sodium Sulfoccinate");
        sulfatosFracos.add("Methyl Cocoyl");
        sulfatosFracos.add("Lauryl Taurate");
        sulfatosFracos.add("Pluronic Surfactants");
        sulfatosFracos.add("Tetronic Surfactants");
        sulfatosFracos.add("Pluronic ou Tetronic Surfactants");
        sulfatosFracos.add("Poluglucosides");
        sulfatosFracos.add("Poly Decayl");
        sulfatosFracos.add("Glucoside Carboxylate");
        return sulfatosFracos;
    }

    public List<String> getSiliconesInsoluveis() {
        siliconesInsoluveis.add("Amodimethicone");
        siliconesInsoluveis.add("Dimethicone");
        siliconesInsoluveis.add("Cyclomethicone");
        siliconesInsoluveis.add("Cyclopentasiloxane");
        siliconesInsoluveis.add("Simethycone");
        siliconesInsoluveis.add("Methicone");
        siliconesInsoluveis.add("Cetyl Dimethicone");
        siliconesInsoluveis.add("Cetearyl Methicone");
        siliconesInsoluveis.add("Dimethicone Crosspolymer");
        siliconesInsoluveis.add("Bis-aminopropyl Dimethicone");
        siliconesInsoluveis.add("Trimethylsilylamodimethicone");
        siliconesInsoluveis.add("Phenylpropyldimethysiloxysilicate");
        siliconesInsoluveis.add("Disloxane");
        siliconesInsoluveis.add("Hexamethyldisiloxane");
        siliconesInsoluveis.add("Aminopropyltriethoxysilane");
        siliconesInsoluveis.add("Stearyl Dimethicone");
        siliconesInsoluveis.add("Phenyl Trimethicone");
        siliconesInsoluveis.add("Vinyl Dimethicone Crosspolymer");
        siliconesInsoluveis.add("Vinyl Dimethicone");
        siliconesInsoluveis.add("Trisiloxane");
        siliconesInsoluveis.add("Polydimethylsiloxane");
        siliconesInsoluveis.add("Dimethylpolysiloxane");
        return siliconesInsoluveis;
    }

    public List<String> getSiliconesSoluveis() {
        siliconesSoluveis.add("Dimethicone Copolyol");
        siliconesSoluveis.add("Lauryl Methicone Copolyol");
        siliconesSoluveis.add("PEG-7 Amodimethicone");
        siliconesSoluveis.add("PEG-X Dimethicone");
        siliconesSoluveis.add("Ammonium Dimethicone PEG-7 Sulfate");
        siliconesSoluveis.add("Dimethicone PEG-X Phosphate");
        siliconesSoluveis.add("Dimethicone PEG-X Benzoate");
        siliconesSoluveis.add("Dimethicone PEG-X Adipate");
        siliconesSoluveis.add("Dimethicone PEG-X/PPGX Phosphate");
        siliconesSoluveis.add("PEG/PPG-X Dimethicone");
        siliconesSoluveis.add("PEG-40/PPG-8 Methylaminopropyldimethicone");
        siliconesSoluveis.add("Crosspolyemer");
        siliconesSoluveis.add("Hydroxypropyl Polysiloxane");
        return siliconesSoluveis;
    }

    public List<String> agentesLimpeza() {
        agentesLimpeza.add("Cocamidopropyl Beatine");
        agentesLimpeza.add("Coco Beataine");
        agentesLimpeza.add("Babassuamidopropyl Betaine");
        agentesLimpeza.add("Coco Amido Propil Betaine");
        agentesLimpeza.add("Lauryl Glocoside");
        agentesLimpeza.add("Dissodium Cocoyl Glytamate");
        return agentesLimpeza;
    }

    public List<String> oleoMineral() {
        oleoMineral.add("Mineral Oil");
        oleoMineral.add("Óleo Mineral");
        oleoMineral.add("Petrolatum");
        oleoMineral.add("Paraffinum Liquidum");
        oleoMineral.add("Parafina Liquida");
        oleoMineral.add("Vaselin");
        oleoMineral.add("Vaselina");
        oleoMineral.add("Isoparaffin");
        oleoMineral.add("Isoparafina");
        oleoMineral.add("Isododecane");
        oleoMineral.add("Isododecene");
        oleoMineral.add("Alkane");
        oleoMineral.add("Dodecano");
        oleoMineral.add("Dodecane");
        oleoMineral.add("Isododecane");
        oleoMineral.add("Dodeceno");
        return oleoMineral;
    }
}
