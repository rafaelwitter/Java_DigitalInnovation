package utils.operacao;

import utils.operacao.internal.DivHelper;
import utils.operacao.internal.MulHelper;
import utils.operacao.internal.SubHelper;
import utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;
    private MulHelper mulHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        subHelper = new SubHelper();
        mulHelper = new MulHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }
    public int mul(int a, int b){
        return mulHelper.execute(a,b);
    }
    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }
    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
}
