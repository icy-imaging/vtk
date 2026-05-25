// java wrapper for vtkXMLFileOutputWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLFileOutputWindow extends vtkFileOutputWindow
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

  private native void DisplayText_4(byte[] id0, int len0);
  public void DisplayText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayText_4(bytes0, bytes0.length);
  }

  private native void DisplayErrorText_5(byte[] id0, int len0);
  public void DisplayErrorText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayErrorText_5(bytes0, bytes0.length);
  }

  private native void DisplayWarningText_6(byte[] id0, int len0);
  public void DisplayWarningText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayWarningText_6(bytes0, bytes0.length);
  }

  private native void DisplayGenericWarningText_7(byte[] id0, int len0);
  public void DisplayGenericWarningText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayGenericWarningText_7(bytes0, bytes0.length);
  }

  private native void DisplayDebugText_8(byte[] id0, int len0);
  public void DisplayDebugText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayDebugText_8(bytes0, bytes0.length);
  }

  private native void DisplayTag_9(byte[] id0, int len0);
  public void DisplayTag(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayTag_9(bytes0, bytes0.length);
  }

  public vtkXMLFileOutputWindow() { super(); }

  public vtkXMLFileOutputWindow(long id) { super(id); }
  public native long   VTKInit();

}
