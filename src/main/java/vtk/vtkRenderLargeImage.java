// java wrapper for vtkRenderLargeImage object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderLargeImage extends vtkAlgorithm
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

  private native void SetMagnification_4(int id0);
  public void SetMagnification(int id0)
  {
    SetMagnification_4(id0);
  }

  private native int GetMagnification_5();
  public int GetMagnification()
  {
    return GetMagnification_5();
  }

  private native void SetInput_6(vtkRenderer id0);
  public void SetInput(vtkRenderer id0)
  {
    SetInput_6(id0);
  }

  private native long GetInput_7();
  public vtkRenderer GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_8();
  public vtkImageData GetOutput()
  {
    long temp = GetOutput_8();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkRenderLargeImage() { super(); }

  public vtkRenderLargeImage(long id) { super(id); }
  public native long   VTKInit();

}
