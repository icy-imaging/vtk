// java wrapper for vtkHyperTreeGridGradient object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridGradient extends vtkHyperTreeGridAlgorithm
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

  private native void SetComputeGradient_4(boolean id0);
  public void SetComputeGradient(boolean id0)
  {
    SetComputeGradient_4(id0);
  }

  private native boolean GetComputeGradient_5();
  public boolean GetComputeGradient()
  {
    return GetComputeGradient_5();
  }

  private native void ComputeGradientOn_6();
  public void ComputeGradientOn()
  {
    ComputeGradientOn_6();
  }

  private native void ComputeGradientOff_7();
  public void ComputeGradientOff()
  {
    ComputeGradientOff_7();
  }

  private native void SetGradientArrayName_8(byte[] id0, int len0);
  public void SetGradientArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGradientArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetGradientArrayName_9();
  public String GetGradientArrayName()
  {
    return new String(GetGradientArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetResultArrayName_10(byte[] id0, int len0);
  public void SetResultArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetResultArrayName_10(bytes0, bytes0.length);
  }

  private native byte[] GetResultArrayName_11();
  public String GetResultArrayName()
  {
    return new String(GetResultArrayName_11(), StandardCharsets.UTF_8);
  }

  private native void SetMode_12(int id0);
  public void SetMode(int id0)
  {
    SetMode_12(id0);
  }

  private native int GetModeMinValue_13();
  public int GetModeMinValue()
  {
    return GetModeMinValue_13();
  }

  private native int GetModeMaxValue_14();
  public int GetModeMaxValue()
  {
    return GetModeMaxValue_14();
  }

  private native int GetMode_15();
  public int GetMode()
  {
    return GetMode_15();
  }

  private native void SetExtensiveComputation_16(boolean id0);
  public void SetExtensiveComputation(boolean id0)
  {
    SetExtensiveComputation_16(id0);
  }

  private native boolean GetExtensiveComputation_17();
  public boolean GetExtensiveComputation()
  {
    return GetExtensiveComputation_17();
  }

  private native void ExtensiveComputationOn_18();
  public void ExtensiveComputationOn()
  {
    ExtensiveComputationOn_18();
  }

  private native void ExtensiveComputationOff_19();
  public void ExtensiveComputationOff()
  {
    ExtensiveComputationOff_19();
  }

  private native void SetComputeDivergence_20(boolean id0);
  public void SetComputeDivergence(boolean id0)
  {
    SetComputeDivergence_20(id0);
  }

  private native boolean GetComputeDivergence_21();
  public boolean GetComputeDivergence()
  {
    return GetComputeDivergence_21();
  }

  private native void ComputeDivergenceOn_22();
  public void ComputeDivergenceOn()
  {
    ComputeDivergenceOn_22();
  }

  private native void ComputeDivergenceOff_23();
  public void ComputeDivergenceOff()
  {
    ComputeDivergenceOff_23();
  }

  private native void SetDivergenceArrayName_24(byte[] id0, int len0);
  public void SetDivergenceArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDivergenceArrayName_24(bytes0, bytes0.length);
  }

  private native byte[] GetDivergenceArrayName_25();
  public String GetDivergenceArrayName()
  {
    return new String(GetDivergenceArrayName_25(), StandardCharsets.UTF_8);
  }

  private native void SetComputeVorticity_26(boolean id0);
  public void SetComputeVorticity(boolean id0)
  {
    SetComputeVorticity_26(id0);
  }

  private native boolean GetComputeVorticity_27();
  public boolean GetComputeVorticity()
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

  private native void SetVorticityArrayName_30(byte[] id0, int len0);
  public void SetVorticityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVorticityArrayName_30(bytes0, bytes0.length);
  }

  private native byte[] GetVorticityArrayName_31();
  public String GetVorticityArrayName()
  {
    return new String(GetVorticityArrayName_31(), StandardCharsets.UTF_8);
  }

  private native void SetComputeQCriterion_32(boolean id0);
  public void SetComputeQCriterion(boolean id0)
  {
    SetComputeQCriterion_32(id0);
  }

  private native boolean GetComputeQCriterion_33();
  public boolean GetComputeQCriterion()
  {
    return GetComputeQCriterion_33();
  }

  private native void ComputeQCriterionOn_34();
  public void ComputeQCriterionOn()
  {
    ComputeQCriterionOn_34();
  }

  private native void ComputeQCriterionOff_35();
  public void ComputeQCriterionOff()
  {
    ComputeQCriterionOff_35();
  }

  private native void SetQCriterionArrayName_36(byte[] id0, int len0);
  public void SetQCriterionArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetQCriterionArrayName_36(bytes0, bytes0.length);
  }

  private native byte[] GetQCriterionArrayName_37();
  public String GetQCriterionArrayName()
  {
    return new String(GetQCriterionArrayName_37(), StandardCharsets.UTF_8);
  }

  public vtkHyperTreeGridGradient() { super(); }

  public vtkHyperTreeGridGradient(long id) { super(id); }
  public native long   VTKInit();

}
