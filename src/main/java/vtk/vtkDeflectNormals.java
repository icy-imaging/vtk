// java wrapper for vtkDeflectNormals object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDeflectNormals extends vtkDataSetAlgorithm
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

  private native void SetUserNormal_6(double id0,double id1,double id2);
  public void SetUserNormal(double id0,double id1,double id2)
  {
    SetUserNormal_6(id0,id1,id2);
  }

  private native void SetUserNormal_7(double id0[]);
  public void SetUserNormal(double id0[])
  {
    SetUserNormal_7(id0);
  }

  private native double[] GetUserNormal_8();
  public double[] GetUserNormal()
  {
    return GetUserNormal_8();
  }

  private native void SetUseUserNormal_9(boolean id0);
  public void SetUseUserNormal(boolean id0)
  {
    SetUseUserNormal_9(id0);
  }

  private native boolean GetUseUserNormal_10();
  public boolean GetUseUserNormal()
  {
    return GetUseUserNormal_10();
  }

  private native void UseUserNormalOn_11();
  public void UseUserNormalOn()
  {
    UseUserNormalOn_11();
  }

  private native void UseUserNormalOff_12();
  public void UseUserNormalOff()
  {
    UseUserNormalOff_12();
  }

  public vtkDeflectNormals() { super(); }

  public vtkDeflectNormals(long id) { super(id); }
  public native long   VTKInit();

}
