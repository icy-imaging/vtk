// java wrapper for vtkTransformPolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransformPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetTransform_5(vtkAbstractTransform id0);
  public void SetTransform(vtkAbstractTransform id0)
  {
    SetTransform_5(id0);
  }

  private native long GetTransform_6();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_6();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_7(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_7(id0);
  }

  private native int GetOutputPointsPrecision_8();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_8();
  }

  public vtkTransformPolyDataFilter() { super(); }

  public vtkTransformPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
