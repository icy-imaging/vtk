// java wrapper for vtkAffineRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAffineRepresentation extends vtkWidgetRepresentation
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

  private native void GetTransform_4(vtkTransform id0);
  public void GetTransform(vtkTransform id0)
  {
    GetTransform_4(id0);
  }

  private native void SetTolerance_5(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_5(id0);
  }

  private native int GetToleranceMinValue_6();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_6();
  }

  private native int GetToleranceMaxValue_7();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_7();
  }

  private native int GetTolerance_8();
  public int GetTolerance()
  {
    return GetTolerance_8();
  }

  private native void ShallowCopy_9(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_9(id0);
  }

  public vtkAffineRepresentation() { super(); }

  public vtkAffineRepresentation(long id) { super(id); }

}
