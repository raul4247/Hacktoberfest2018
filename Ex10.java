class Instituicao{
    private int codigo;
    private String nome;
    private String sigla;
    private int codigoMantenedora;
    private String mantenedora;
    private int categoria;
    private int organizacao;
    private int codigoMunicipio;
    private String municipio;
    private String uf;
    private String regiao;
    private int tecnico;
    private int periodico;
    private int livro;
    private double receita;
    private double transferencia;
    private double outraReceita;
    private double despesaDocente;
    private double despesaTecnico;
    private double despesaEncargo;
    private double despesaCusteio;
    private double despesaInvestimento;
    private double despesaPesquisa;
    private double despesaOutras;
 
    public Instituicao(int codigo, String nome, String sigla){
        this.codigo=codigo;
        this.nome=nome;
        this.sigla=sigla;
    }
    public Instituicao(){
        this.codigo = 0;
        this.nome = "";
        this.sigla = "";
        this.codigoMantenedora = 0;
        this.mantenedora = "";
        this.categoria = 0;
        this.organizacao = 0;
        this.codigoMunicipio = 0;
        this.municipio = "";
        this.uf = "";
        this.regiao = "";
        this.tecnico = 0;
        this.periodico = 0;
        this.livro = 0;
        this.receita = 0;
        this.transferencia = 0;
        this.outraReceita = 0;
        this.despesaDocente = 0;
        this.despesaTecnico = 0;
        this.despesaEncargo = 0;
        this.despesaCusteio = 0;
        this.despesaInvestimento = 0;
        this.despesaPesquisa = 0;
        this.despesaOutras = 0;
    }
 
 
    public int getCodigo(){ return this.codigo; }
    public void setCodigo(int codigo){ this.codigo = codigo; }
    public void printCodigo(){ MyIO.print(this.codigo + " "); }
 
 
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }
    public void printNome(){ MyIO.print(this.nome + " "); }
 
 
    public String getSigla(){ return this.sigla; }
    public void setSigla(String sigla){ this.sigla = sigla; }
    public void printSigla(){ MyIO.print(this.sigla + " "); }
 
 
    public int getCodigoMantenedora(){ return this.codigoMantenedora; }
    public void setCodigoMantenedora(int codigoMantenedora){ this.codigoMantenedora = codigoMantenedora; }
    public void printCodigoMantenedora(){ MyIO.print(this.codigoMantenedora + " "); }
 
 
    public String getMantenedora(){ return this.mantenedora; }
    public void setMantenedora(String mantenedora){ this.mantenedora = mantenedora; }
    public void printMantenedora(){ MyIO.print(this.mantenedora + " "); }
 
 
    public int getCategoria(){ return this.categoria; }
    public void setCategoria(int categoria){ this.categoria = categoria; }
    public void printCategoria(){ MyIO.print(this.categoria + " "); }
 
 
    public int getOrganizacao(){ return this.organizacao; }
    public void setOrganizacao(int organizacao) { this.organizacao = organizacao; }
    public void printOrganizacao(){ MyIO.print(this.organizacao + " "); }
 
 
    public int getCodigoMunicipio(){ return this.codigoMunicipio; }
    public void setCodigoMunicipio(int codigoMunicipio){ this.codigoMunicipio = codigoMunicipio; }
    public void printCodigoMunicipio(){ MyIO.print(this.codigoMunicipio + " "); }
 
 
    public String getMunicipio(){ return this.municipio; }
    public void setMunicipio(String municipio){ this.municipio = municipio; }
    public void printMunicipio(){ MyIO.print(this.municipio + " "); }
 
 
    public String getUf(){ return this.uf; }
    public void setUf(String uf){ this.uf = uf; }
    public void printUf(){ MyIO.print(this.uf + " "); }
 
 
    public String getRegiao(){ return this.regiao; }
    public void setRegiao(String regiao){ this.regiao = regiao; }
    public void printRegiao(){ MyIO.print(this.regiao + " "); }
 
 
    public int getTecnico(){ return this.tecnico; }
    public void setTecnico(int tecnico){ this.tecnico = tecnico; }
    public void printTecnico(){ MyIO.print(this.tecnico + " "); }
 
 
    public int getPeriodico(){ return this.periodico; }
    public void setPeriodico(int periodico){ this.periodico = periodico; }
    public void printPeriodico(){ MyIO.print(this.periodico + " "); }
 
 
    public int getLivro(){ return this.livro; }
    public void setLivro(int livro){ this.livro = livro; }
    public void printLivro(){ MyIO.print(this.livro + " "); }
 
 
    public double getReceita(){ return this.receita; }
    public void setReceita(double receita){ this.receita= receita; }
    public void printReceita(){ MyIO.print(this.receita + " "); }
 
 
    public double getTransferencia(){ return this.transferencia; }
    public void setTransferencia(double transferencia){ this.transferencia = transferencia; }
    public void printTransferencia(){ MyIO.print(this.transferencia + " "); }
 
 
    public double getOutraReceita(){ return this.outraReceita; }
    public void setOutraReceita(double outraReceita){ this.outraReceita = outraReceita; }
    public void printOutraReceita(){ MyIO.print(this.outraReceita + " "); }
 
 
    public double getDespesaDocente(){ return this.despesaDocente; }
    public void setDespesaDocente(double despesaDocente){ this.despesaDocente = despesaDocente; }
    public void printDespesaDocente(){ MyIO.print(this.despesaDocente + " "); }
 
 
    public double getDespesaTecnico(){ return this.despesaTecnico; }
    public void setDespesaTecnico(double despesaTecnico){ this.despesaTecnico = despesaTecnico; }
    public void printDespesaTecnico(){ MyIO.print(this.despesaTecnico + " "); }
 
 
    public double getDespesaEncargo(){ return this.despesaEncargo; }
    public void setDespesaEncargo(double despesaEncargo){ this.despesaEncargo = despesaEncargo; }
    public void printDespesaEncargo(){ MyIO.print(this.despesaEncargo + " "); }
 
 
    public double getDespesaCusteio(){ return this.despesaCusteio; }
    public void setDespesaCusteio(double despesaCusteio){ this.despesaCusteio = despesaCusteio; }
    public void printDespesaCusteio(){ MyIO.print(this.despesaCusteio + " "); }
 
 
    public double getDespesaInvestimento(){ return this.despesaInvestimento; }
    public void setDespesaInvestimento(double despesaInvestimento){ this.despesaInvestimento = despesaInvestimento; }
    public void printDespesaInvestimento(){ MyIO.print(this.despesaInvestimento + " "); }
 
 
    public double getDespesaPesquisa(){ return this.despesaPesquisa; }
    public void setDespesaPesquisa(double despesaPesquisa){ this.despesaPesquisa = despesaPesquisa; }
    public void printDespesaPesquisa(){ MyIO.print(this.despesaPesquisa + " "); }
 
 
    public double getDespesaOutras(){ return this.despesaOutras; }
    public void setDespesaOutras(double despesaOutras){ this.despesaOutras = despesaOutras; }
    public void printDespesaOutras(){ MyIO.println(this.despesaOutras); }
     
    public Instituicao clone(){
        Instituicao newInst = new Instituicao();
        newInst.setCodigo(this.getCodigo());
        newInst.setNome(this.getNome());
        newInst.setSigla(this.getSigla());
        newInst.setCodigoMantenedora(this.getCodigoMantenedora());
        newInst.setMantenedora(this.getMantenedora());
        newInst.setCategoria(this.getCategoria());
        newInst.setOrganizacao(this.getOrganizacao());
        newInst.setCodigoMunicipio(this.getCodigoMunicipio());
        newInst.setMunicipio(this.getMunicipio());
        newInst.setUf(this.getUf());
        newInst.setRegiao(this.getRegiao());
        newInst.setTecnico(this.getTecnico());
        newInst.setPeriodico(this.getPeriodico());
        newInst.setLivro(this.getLivro());
        newInst.setReceita(this.getReceita());
        newInst.setTransferencia(this.getTransferencia());
        newInst.setOutraReceita(this.getOutraReceita());
        newInst.setDespesaDocente(this.getDespesaDocente());
        newInst.setDespesaTecnico(this.getDespesaTecnico());
        newInst.setDespesaEncargo(this.getDespesaEncargo());
        newInst.setDespesaCusteio(this.getDespesaCusteio());
        newInst.setDespesaInvestimento(this.getDespesaInvestimento());
        newInst.setDespesaPesquisa(this.getDespesaPesquisa());
        newInst.setDespesaOutras(this.getDespesaOutras());           
 
        return newInst;
    }
 
    public void printAll(){
        this.printCodigo();
        this.printNome();
        this.printSigla();
        this.printCodigoMantenedora();
        this.printMantenedora();
        this.printCategoria();
        this.printOrganizacao();
        this.printCodigoMunicipio();
        this.printMunicipio();
        this.printUf();
        this.printRegiao();
        this.printTecnico();
        this.printPeriodico();
        this.printLivro();
        this.printReceita();
        this.printTransferencia();
        this.printOutraReceita();
        this.printDespesaDocente();
        this.printDespesaTecnico();
        this.printDespesaEncargo();
        this.printDespesaCusteio();
        this.printDespesaInvestimento();
        this.printDespesaPesquisa();
        this.printDespesaOutras();
    }
}
 
class Lista {
    Instituicao [] array;
    public int qtd;
    public int comps;
    public int swaps;
     
    public Lista(){
        this.array = new Instituicao[5];
        this.comps=0;
        this.swaps=0;
    }
     
    public Lista(int tamanho){
        this.array = new Instituicao[tamanho];
        this.qtd=0;
        this.comps=0;
        this.swaps=0;
    }
 
    public void inserirInicio(Instituicao newInst) throws Exception{
        if(this.qtd>=this.array.length)
            throw new Exception("Não cabe mais no array!");
     
        for(int i=this.qtd;i>0;i--)
            this.array[i] = this.array[i-1];
        this.array[0] = newInst;
        this.qtd++;
    }
     
    void inserirFim(Instituicao newInst) throws Exception{
        if(this.qtd>=this.array.length)
            throw new Exception("Não cabe mais no array!");
 
        this.array[this.qtd] = newInst;
        this.qtd++;
    }
     
    void inserir(Instituicao newInst, int pos) throws Exception{
        if(this.qtd>=array.length)
            throw new Exception("Não cabe mais no array!");
 
        if(pos<0 || pos>this.qtd)
            throw new Exception("Posição inválida!");
 
        for(int i=this.qtd;i>pos;i--)
            this.array[i] = this.array[i-1];
        this.array[pos] = newInst;
        this.qtd++;
    }   
 
    public Instituicao removerInicio() throws Exception{
        if(this.qtd==0)
            throw new Exception("Array já está vazia!");
 
        Instituicao elem = this.array[0];
        this.qtd--;
 
        for (int i=0;i<this.qtd;i++)
            this.array[i] = this.array[i+1];
        return elem;
    }
 
    public Instituicao removerFim() throws Exception{
        if (this.qtd==0)
            throw new Exception("Array já está vazia!");
 
        return this.array[--this.qtd];
    }
     
    public Instituicao remover(int pos) throws Exception{
        if(this.qtd==0)
            throw new Exception("Array já está vazia!");
 
        if(pos<0 || pos>this.qtd)
            throw new Exception("Posição inválida!");
 
        Instituicao elem = this.array[pos];
        this.qtd--;
 
        for (int i=pos;i<this.qtd;i++)
            this.array[i] = this.array[i+1];
        return elem;
    }
 
    public void buildHeap(int n, int i){
        int raiz=i;
        int esq = (2*i) + 1;
        int dir = (2*i) + 2;
        Instituicao temp;
     
        if (esq < n && this.array[esq].getCodigoMunicipio() <= this.array[raiz].getCodigoMunicipio()){
            if(this.array[esq].getCodigoMunicipio() == this.array[raiz].getCodigoMunicipio()){
                if(this.array[esq].getSigla().compareTo(this.array[raiz].getSigla())<0){
                    this.comps++;
                    raiz = esq;
                }
            }
            else{
                this.comps++;
                raiz = esq;
            }
        }
      
        if (dir < n && this.array[dir].getCodigoMunicipio() <= this.array[raiz].getCodigoMunicipio()){
            if(this.array[dir].getCodigoMunicipio() == this.array[raiz].getCodigoMunicipio()){
                if(this.array[dir].getSigla().compareTo(this.array[raiz].getSigla())<0){
                    this.comps++;
                    raiz = dir;
                }
            }
            else{
                this.comps++;
                raiz = dir;
            }
        }
      
        if (raiz!=i){
            temp=array[i].clone();
            array[i]=array[raiz].clone();
            array[raiz]=temp.clone();
            this.swaps++;
            buildHeap(n, raiz);
        }
    }
      
    public void ordenar(int k){
        int i;
        Instituicao temp;
     
        for(i=(this.qtd/2)-1;i>=0;i--)
            buildHeap(this.qtd, i);
     
        for(i=this.qtd-1;i>=0;i--){
            this.swaps++;
            temp=array[0].clone();
            array[0]=array[i].clone();
            array[i]=temp.clone();
            buildHeap(i, 0);
        }
    }
    public void mostrar(int k){
        for(int i=qtd-1;i>=qtd-1-k;i--){
            this.array[i].printAll();
        }
    }
}
 
public class Ex10{
    public static Instituicao readInst(String path, int numLinha){
        Arq.openRead(path,"ISO-8859-1");
        String [] linha = new String[24];
        Instituicao inst = new Instituicao();
        numLinha++;
        linha = Arq.readLine().split("\t");
 
        for(int i=0;i<numLinha-1;i++)
            linha = Arq.readLine().split("\t");
 
        inst.setCodigo(Integer.parseInt(linha[0]));
        inst.setNome(linha[1]);
        inst.setSigla(linha[2]);
        inst.setCodigoMantenedora(Integer.parseInt(linha[3]));
        inst.setMantenedora(linha[4]);
        inst.setCategoria(Integer.parseInt(linha[5]));
        inst.setOrganizacao(Integer.parseInt(linha[6]));
        inst.setCodigoMunicipio(Integer.parseInt(linha[7]));
        inst.setMunicipio(linha[8]);
        inst.setUf(linha[9]);
        inst.setRegiao(linha[10]);
        inst.setTecnico(Integer.parseInt(linha[11]));
        inst.setPeriodico(Integer.parseInt(linha[12]));
        inst.setLivro(Integer.parseInt(linha[13]));
        inst.setReceita(Double.parseDouble(linha[14]));
        inst.setTransferencia(Double.parseDouble(linha[15]));
        inst.setOutraReceita(Double.parseDouble(linha[16]));
        inst.setDespesaDocente(Double.parseDouble(linha[17]));
        inst.setDespesaTecnico(Double.parseDouble(linha[18]));
        inst.setDespesaEncargo(Double.parseDouble(linha[19]));
        inst.setDespesaCusteio(Double.parseDouble(linha[20]));
        inst.setDespesaInvestimento(Double.parseDouble(linha[21]));
        inst.setDespesaPesquisa(Double.parseDouble(linha[22]));
        inst.setDespesaOutras(Double.parseDouble(linha[23]));
 
        Arq.close();
        return inst;
    }
 
    public static boolean igual(String a, String b){
        if(a.length()!=b.length())
            return false;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i))
                return false;
        return true;
    }
 
    public static void main(String[] args) throws Exception{
        Lista lista = new Lista(1000);
        String input;
        String path = "/tmp/censo.dat";
        Instituicao inst = new Instituicao();
 
        do{
            input = MyIO.readLine();
            if(!igual(input,"0") && !igual(input," ") && !igual(input,"\n") && !igual(input,"FIM")){
                inst = readInst(path,Integer.parseInt(input));
                lista.inserirFim(inst);
            }
        }while(!igual(input,"0") && !igual(input," ") && !igual(input,"\n") && !igual(input,"FIM"));
 
        long startTime = System.nanoTime();
        lista.ordenar(10);
        long endTime = System.nanoTime();
 
        lista.mostrar(10);     
 
        double duration = (endTime - startTime)/1000000.0;
        Arq.openWrite("635382_heapsort.txt");
        Arq.print("635382\t"+lista.comps+"\t"+lista.swaps+duration+"ms\t");   
        Arq.close();    
    }
}