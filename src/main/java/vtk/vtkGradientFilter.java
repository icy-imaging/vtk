// java wrapper for vtkGradientFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGradientFilter extends vtkDataSetAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetInputScalars_4(int id0,byte[] id1, int len1);
  public void SetInputScalars(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputScalars_4(id0,bytes1, bytes1.length);
  }

  private native void SetInputScalars_5(int id0,int id1);
  public void SetInputScalars(int id0,int id1)
  {
    SetInputScalars_5(id0,id1);
  }

  private native byte[] GetResultArrayName_6();
  public String GetResultArrayName()
  {
    return new String(GetResultArrayName_6(), StandardCharsets.UTF_8);
  }

  private native void SetResultArrayName_7(byte[] id0, int len0);
  public void SetResultArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetResultArrayName_7(bytes0, bytes0.length);
  }

  private native byte[] GetDivergenceArrayName_8();
  public String GetDivergenceArrayName()
  {
    return new String(GetDivergenceArrayName_8(), StandardCharsets.UTF_8);
  }

  private native void SetDivergenceArrayName_9(byte[] id0, int len0);
  public void SetDivergenceArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDivergenceArrayName_9(bytes0, bytes0.length);
  }

  private native byte[] GetVorticityArrayName_10();
  public String GetVorticityArrayName()
  {
    return new String(GetVorticityArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetVorticityArrayName_11(byte[] id0, int len0);
  public void SetVorticityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVorticityArrayName_11(bytes0, bytes0.length);
  }

  private native byte[] GetQCriterionArrayName_12();
  public String GetQCriterionArrayName()
  {
    return new String(GetQCriterionArrayName_12(), StandardCharsets.UTF_8);
  }

  private native void SetQCriterionArrayName_13(byte[] id0, int len0);
  public void SetQCriterionArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetQCriterionArrayName_13(bytes0, bytes0.length);
  }

  private native int GetFasterApproximation_14();
  public int GetFasterApproximation()
  {
    return GetFasterApproximation_14();
  }

  private native void SetFasterApproximation_15(int id0);
  public void SetFasterApproximation(int id0)
  {
    SetFasterApproximation_15(id0);
  }

  private native void FasterApproximationOn_16();
  public void FasterApproximationOn()
  {
    FasterApproximationOn_16();
  }

  private native void FasterApproximationOff_17();
  public void FasterApproximationOff()
  {
    FasterApproximationOff_17();
  }

  private native void SetComputeGradient_18(int id0);
  public void SetComputeGradient(int id0)
  {
    SetComputeGradient_18(id0);
  }

  private native int GetComputeGradient_19();
  public int GetComputeGradient()
  {
    return GetComputeGradient_19();
  }

  private native void ComputeGradientOn_20();
  public void ComputeGradientOn()
  {
    ComputeGradientOn_20();
  }

  private native void ComputeGradientOff_21();
  public void ComputeGradientOff()
  {
    ComputeGradientOff_21();
  }

  private native void SetComputeDivergence_22(int id0);
  public void SetComputeDivergence(int id0)
  {
    SetComputeDivergence_22(id0);
  }

  private native int GetComputeDivergence_23();
  public int GetComputeDivergence()
  {
    return GetComputeDivergence_23();
  }

  private native void ComputeDivergenceOn_24();
  public void ComputeDivergenceOn()
  {
    ComputeDivergenceOn_24();
  }

  private native void ComputeDivergenceOff_25();
  public void ComputeDivergenceOff()
  {
    ComputeDivergenceOff_25();
  }

  private native void SetComputeVorticity_26(int id0);
  public void SetComputeVorticity(int id0)
  {
    SetComputeVorticity_26(id0);
  }

  private native int GetComputeVorticity_27();
  public int GetComputeVorticity()
  {
    return GetComputeVorticity_27();
  }

  private native void ComputeVorticityOn_28();
  public void ComputeVorticityOn()
  {
    ComputeVorticityOn_28();
  }

  private native void ComputeVorticityOff_29();
  public void ComputeVorticityOff()
  {
    ComputeVorticityOff_29();
  }

  private native void SetComputeQCriterion_30(int id0);
  public void SetComputeQCriterion(int id0)
  {
    SetComputeQCriterion_30(id0);
  }

  private native int GetComputeQCriterion_31();
  public int GetComputeQCriterion()
  {
    return GetComputeQCriterion_31();
  }

  private native void ComputeQCriterionOn_32();
  public void ComputeQCriterionOn()
  {
    ComputeQCriterionOn_32();
  }

  private native void ComputeQCriterionOff_33();
  public void ComputeQCriterionOff()
  {
    ComputeQCriterionOff_33();
  }

  private native void SetContributingCellOption_34(int id0);
  public void SetContributingCellOption(int id0)
  {
    SetContributingCellOption_34(id0);
  }

  private native int GetContributingCellOptionMinValue_35();
  public int GetContributingCellOptionMinValue()
  {
    return GetContributingCellOptionMinValue_35();
  }

  private native int GetContributingCellOptionMaxValue_36();
  public int GetContributingCellOptionMaxValue()
  {
    return GetContributingCellOptionMaxValue_36();
  }

  private native int GetContributingCellOption_37();
  public int GetContributingCellOption()
  {
    return GetContributingCellOption_37();
  }

  private native void SetReplacementValueOption_38(int id0);
  public void SetReplacementValueOption(int id0)
  {
    SetReplacementValueOption_38(id0);
  }

  private native int GetReplacementValueOptionMinValue_39();
  public int GetReplacementValueOptionMinValue()
  {
    return GetReplacementValueOptionMinValue_39();
  }

  private native int GetReplacementValueOptionMaxValue_40();
  public int GetReplacementValueOptionMaxValue()
  {
    return GetReplacementValueOptionMaxValue_40();
  }

  private native int GetReplacementValueOption_41();
  public int GetReplacementValueOption()
  {
    return GetReplacementValueOption_41();
  }

  public vtkGradientFilter() { super(); }

  public vtkGradientFilter(long id) { super(id); }
  public native long   VTKInit();

}
