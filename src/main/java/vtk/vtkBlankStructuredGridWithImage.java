// java wrapper for vtkBlankStructuredGridWithImage object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBlankStructuredGridWithImage extends vtkStructuredGridAlgorithm
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

  private native void SetBlankingInputData_4(vtkImageData id0);
  public void SetBlankingInputData(vtkImageData id0)
  {
    SetBlankingInputData_4(id0);
  }

  private native long GetBlankingInput_5();
  public vtkImageData GetBlankingInput()
  {
    long temp = GetBlankingInput_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBlankStructuredGridWithImage() { super(); }

  public vtkBlankStructuredGridWithImage(long id) { super(id); }
  public native long   VTKInit();

}
