// java wrapper for vtkPolyDataToImageStencil object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataToImageStencil extends vtkImageStencilSource
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

  private native void SetInputData_4(vtkPolyData id0);
  public void SetInputData(vtkPolyData id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInput_5();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_6(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_6(id0);
  }

  private native double GetToleranceMinValue_7();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_7();
  }

  private native double GetToleranceMaxValue_8();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_8();
  }

  private native double GetTolerance_9();
  public double GetTolerance()
  {
    return GetTolerance_9();
  }

  private native boolean GetEnableSMP_10();
  public boolean GetEnableSMP()
  {
    return GetEnableSMP_10();
  }

  private native void SetEnableSMP_11(boolean id0);
  public void SetEnableSMP(boolean id0)
  {
    SetEnableSMP_11(id0);
  }

  public vtkPolyDataToImageStencil() { super(); }

  public vtkPolyDataToImageStencil(long id) { super(id); }
  public native long   VTKInit();

}
