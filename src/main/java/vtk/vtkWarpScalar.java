// java wrapper for vtkWarpScalar object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWarpScalar extends vtkPointSetAlgorithm
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

  private native void SetScaleFactor_4(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_4(id0);
  }

  private native double GetScaleFactor_5();
  public double GetScaleFactor()
  {
    return GetScaleFactor_5();
  }

  private native void SetUseNormal_6(int id0);
  public void SetUseNormal(int id0)
  {
    SetUseNormal_6(id0);
  }

  private native int GetUseNormal_7();
  public int GetUseNormal()
  {
    return GetUseNormal_7();
  }

  private native void UseNormalOn_8();
  public void UseNormalOn()
  {
    UseNormalOn_8();
  }

  private native void UseNormalOff_9();
  public void UseNormalOff()
  {
    UseNormalOff_9();
  }

  private native void SetNormal_10(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_10(id0,id1,id2);
  }

  private native void SetNormal_11(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_11(id0);
  }

  private native double[] GetNormal_12();
  public double[] GetNormal()
  {
    return GetNormal_12();
  }

  private native void SetXYPlane_13(int id0);
  public void SetXYPlane(int id0)
  {
    SetXYPlane_13(id0);
  }

  private native int GetXYPlane_14();
  public int GetXYPlane()
  {
    return GetXYPlane_14();
  }

  private native void XYPlaneOn_15();
  public void XYPlaneOn()
  {
    XYPlaneOn_15();
  }

  private native void XYPlaneOff_16();
  public void XYPlaneOff()
  {
    XYPlaneOff_16();
  }

  private native void SetOutputPointsPrecision_17(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_17(id0);
  }

  private native int GetOutputPointsPrecision_18();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_18();
  }

  private native boolean GetGenerateEnclosure_19();
  public boolean GetGenerateEnclosure()
  {
    return GetGenerateEnclosure_19();
  }

  private native void SetGenerateEnclosure_20(boolean id0);
  public void SetGenerateEnclosure(boolean id0)
  {
    SetGenerateEnclosure_20(id0);
  }

  private native void GenerateEnclosureOn_21();
  public void GenerateEnclosureOn()
  {
    GenerateEnclosureOn_21();
  }

  private native void GenerateEnclosureOff_22();
  public void GenerateEnclosureOff()
  {
    GenerateEnclosureOff_22();
  }

  private native int FillInputPortInformation_23(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_23(id0,id1);
  }

  public vtkWarpScalar() { super(); }

  public vtkWarpScalar(long id) { super(id); }
  public native long   VTKInit();

}
