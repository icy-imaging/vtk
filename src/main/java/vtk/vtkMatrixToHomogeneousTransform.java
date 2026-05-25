// java wrapper for vtkMatrixToHomogeneousTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMatrixToHomogeneousTransform extends vtkHomogeneousTransform
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

  private native void SetInput_4(vtkMatrix4x4 id0);
  public void SetInput(vtkMatrix4x4 id0)
  {
    SetInput_4(id0);
  }

  private native long GetInput_5();
  public vtkMatrix4x4 GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Inverse_6();
  public void Inverse()
  {
    Inverse_6();
  }

  private native long GetMTime_7();
  public long GetMTime()
  {
    return GetMTime_7();
  }

  private native long MakeTransform_8();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_8();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkMatrixToHomogeneousTransform() { super(); }

  public vtkMatrixToHomogeneousTransform(long id) { super(id); }
  public native long   VTKInit();

}
