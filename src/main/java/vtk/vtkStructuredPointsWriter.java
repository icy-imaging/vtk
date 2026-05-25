// java wrapper for vtkStructuredPointsWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredPointsWriter extends vtkDataWriter
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

  private native long GetInput_4();
  public vtkImageData GetInput()
  {
    long temp = GetInput_4();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_5(int id0);
  public vtkImageData GetInput(int id0)
  {
    long temp = GetInput_5(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWriteExtent_6(boolean id0);
  public void SetWriteExtent(boolean id0)
  {
    SetWriteExtent_6(id0);
  }

  private native boolean GetWriteExtent_7();
  public boolean GetWriteExtent()
  {
    return GetWriteExtent_7();
  }

  private native void WriteExtentOn_8();
  public void WriteExtentOn()
  {
    WriteExtentOn_8();
  }

  private native void WriteExtentOff_9();
  public void WriteExtentOff()
  {
    WriteExtentOff_9();
  }

  public vtkStructuredPointsWriter() { super(); }

  public vtkStructuredPointsWriter(long id) { super(id); }
  public native long   VTKInit();

}
