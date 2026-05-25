// java wrapper for vtkCutMaterial object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCutMaterial extends vtkPolyDataAlgorithm
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

  private native void SetMaterialArrayName_4(byte[] id0, int len0);
  public void SetMaterialArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaterialArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetMaterialArrayName_5();
  public String GetMaterialArrayName()
  {
    return new String(GetMaterialArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetMaterial_6(int id0);
  public void SetMaterial(int id0)
  {
    SetMaterial_6(id0);
  }

  private native int GetMaterial_7();
  public int GetMaterial()
  {
    return GetMaterial_7();
  }

  private native void SetArrayName_8(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_9();
  public String GetArrayName()
  {
    return new String(GetArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetUpVector_10(double id0,double id1,double id2);
  public void SetUpVector(double id0,double id1,double id2)
  {
    SetUpVector_10(id0,id1,id2);
  }

  private native void SetUpVector_11(double id0[]);
  public void SetUpVector(double id0[])
  {
    SetUpVector_11(id0);
  }

  private native double[] GetUpVector_12();
  public double[] GetUpVector()
  {
    return GetUpVector_12();
  }

  private native double[] GetMaximumPoint_13();
  public double[] GetMaximumPoint()
  {
    return GetMaximumPoint_13();
  }

  private native double[] GetCenterPoint_14();
  public double[] GetCenterPoint()
  {
    return GetCenterPoint_14();
  }

  private native double[] GetNormal_15();
  public double[] GetNormal()
  {
    return GetNormal_15();
  }

  public vtkCutMaterial() { super(); }

  public vtkCutMaterial(long id) { super(id); }
  public native long   VTKInit();

}
