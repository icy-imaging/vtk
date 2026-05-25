// java wrapper for vtkImageToStructuredPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageToStructuredPoints extends vtkImageAlgorithm
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

  private native void SetVectorInputData_4(vtkImageData id0);
  public void SetVectorInputData(vtkImageData id0)
  {
    SetVectorInputData_4(id0);
  }

  private native long GetVectorInput_5();
  public vtkImageData GetVectorInput()
  {
    long temp = GetVectorInput_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredPointsOutput_6();
  public vtkStructuredPoints GetStructuredPointsOutput()
  {
    long temp = GetStructuredPointsOutput_6();

    if (temp == 0) return null;
    return (vtkStructuredPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImageToStructuredPoints() { super(); }

  public vtkImageToStructuredPoints(long id) { super(id); }
  public native long   VTKInit();

}
