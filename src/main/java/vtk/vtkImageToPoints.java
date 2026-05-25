// java wrapper for vtkImageToPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageToPoints extends vtkPolyDataAlgorithm
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

  private native void SetStencilConnection_4(vtkAlgorithmOutput id0);
  public void SetStencilConnection(vtkAlgorithmOutput id0)
  {
    SetStencilConnection_4(id0);
  }

  private native long GetStencilConnection_5();
  public vtkAlgorithmOutput GetStencilConnection()
  {
    long temp = GetStencilConnection_5();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStencilData_6(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_6(id0);
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

  public vtkImageToPoints() { super(); }

  public vtkImageToPoints(long id) { super(id); }
  public native long   VTKInit();

}
