// java wrapper for vtkRandomHyperTreeGridSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRandomHyperTreeGridSource extends vtkHyperTreeGridAlgorithm
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

  private native void SetDimensions_4(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_4(id0,id1,id2);
  }

  private native double[] GetOutputBounds_5();
  public double[] GetOutputBounds()
  {
    return GetOutputBounds_5();
  }

  private native void SetOutputBounds_6(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetOutputBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetOutputBounds_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetOutputBounds_7(double id0[]);
  public void SetOutputBounds(double id0[])
  {
    SetOutputBounds_7(id0);
  }

  private native int GetSeed_8();
  public int GetSeed()
  {
    return GetSeed_8();
  }

  private native void SetSeed_9(int id0);
  public void SetSeed(int id0)
  {
    SetSeed_9(id0);
  }

  private native long GetMaxDepth_10();
  public long GetMaxDepth()
  {
    return GetMaxDepth_10();
  }

  private native void SetMaxDepth_11(long id0);
  public void SetMaxDepth(long id0)
  {
    SetMaxDepth_11(id0);
  }

  private native long GetMaxDepthMinValue_12();
  public long GetMaxDepthMinValue()
  {
    return GetMaxDepthMinValue_12();
  }

  private native long GetMaxDepthMaxValue_13();
  public long GetMaxDepthMaxValue()
  {
    return GetMaxDepthMaxValue_13();
  }

  private native double GetSplitFraction_14();
  public double GetSplitFraction()
  {
    return GetSplitFraction_14();
  }

  private native void SetSplitFraction_15(double id0);
  public void SetSplitFraction(double id0)
  {
    SetSplitFraction_15(id0);
  }

  private native double GetSplitFractionMinValue_16();
  public double GetSplitFractionMinValue()
  {
    return GetSplitFractionMinValue_16();
  }

  private native double GetSplitFractionMaxValue_17();
  public double GetSplitFractionMaxValue()
  {
    return GetSplitFractionMaxValue_17();
  }

  private native double GetMaskedFraction_18();
  public double GetMaskedFraction()
  {
    return GetMaskedFraction_18();
  }

  private native void SetMaskedFraction_19(double id0);
  public void SetMaskedFraction(double id0)
  {
    SetMaskedFraction_19(id0);
  }

  private native double GetMaskedFractionMinValue_20();
  public double GetMaskedFractionMinValue()
  {
    return GetMaskedFractionMinValue_20();
  }

  private native double GetMaskedFractionMaxValue_21();
  public double GetMaskedFractionMaxValue()
  {
    return GetMaskedFractionMaxValue_21();
  }

  private native double GetActualMaskedCellFraction_22();
  public double GetActualMaskedCellFraction()
  {
    return GetActualMaskedCellFraction_22();
  }

  public vtkRandomHyperTreeGridSource() { super(); }

  public vtkRandomHyperTreeGridSource(long id) { super(id); }
  public native long   VTKInit();

}
