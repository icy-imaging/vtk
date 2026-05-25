// java wrapper for vtkWarpLens object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWarpLens extends vtkPointSetAlgorithm
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

  private native void SetKappa_4(double id0);
  public void SetKappa(double id0)
  {
    SetKappa_4(id0);
  }

  private native double GetKappa_5();
  public double GetKappa()
  {
    return GetKappa_5();
  }

  private native void SetCenter_6(double id0,double id1);
  public void SetCenter(double id0,double id1)
  {
    SetCenter_6(id0,id1);
  }

  private native double[] GetCenter_7();
  public double[] GetCenter()
  {
    return GetCenter_7();
  }

  private native void SetPrincipalPoint_8(double id0,double id1);
  public void SetPrincipalPoint(double id0,double id1)
  {
    SetPrincipalPoint_8(id0,id1);
  }

  private native void SetPrincipalPoint_9(double id0[]);
  public void SetPrincipalPoint(double id0[])
  {
    SetPrincipalPoint_9(id0);
  }

  private native double[] GetPrincipalPoint_10();
  public double[] GetPrincipalPoint()
  {
    return GetPrincipalPoint_10();
  }

  private native void SetK1_11(double id0);
  public void SetK1(double id0)
  {
    SetK1_11(id0);
  }

  private native double GetK1_12();
  public double GetK1()
  {
    return GetK1_12();
  }

  private native void SetK2_13(double id0);
  public void SetK2(double id0)
  {
    SetK2_13(id0);
  }

  private native double GetK2_14();
  public double GetK2()
  {
    return GetK2_14();
  }

  private native void SetP1_15(double id0);
  public void SetP1(double id0)
  {
    SetP1_15(id0);
  }

  private native double GetP1_16();
  public double GetP1()
  {
    return GetP1_16();
  }

  private native void SetP2_17(double id0);
  public void SetP2(double id0)
  {
    SetP2_17(id0);
  }

  private native double GetP2_18();
  public double GetP2()
  {
    return GetP2_18();
  }

  private native void SetFormatWidth_19(double id0);
  public void SetFormatWidth(double id0)
  {
    SetFormatWidth_19(id0);
  }

  private native double GetFormatWidth_20();
  public double GetFormatWidth()
  {
    return GetFormatWidth_20();
  }

  private native void SetFormatHeight_21(double id0);
  public void SetFormatHeight(double id0)
  {
    SetFormatHeight_21(id0);
  }

  private native double GetFormatHeight_22();
  public double GetFormatHeight()
  {
    return GetFormatHeight_22();
  }

  private native void SetImageWidth_23(int id0);
  public void SetImageWidth(int id0)
  {
    SetImageWidth_23(id0);
  }

  private native int GetImageWidth_24();
  public int GetImageWidth()
  {
    return GetImageWidth_24();
  }

  private native void SetImageHeight_25(int id0);
  public void SetImageHeight(int id0)
  {
    SetImageHeight_25(id0);
  }

  private native int GetImageHeight_26();
  public int GetImageHeight()
  {
    return GetImageHeight_26();
  }

  private native int FillInputPortInformation_27(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_27(id0,id1);
  }

  public vtkWarpLens() { super(); }

  public vtkWarpLens(long id) { super(id); }
  public native long   VTKInit();

}
