// java wrapper for vtkExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExporter extends vtkObject
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

  private native void Write_4();
  public void Write()
  {
    Write_4();
  }

  private native void Update_5();
  public void Update()
  {
    Update_5();
  }

  private native void SetRenderWindow_6(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_6(id0);
  }

  private native long GetRenderWindow_7();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_7();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActiveRenderer_8(vtkRenderer id0);
  public void SetActiveRenderer(vtkRenderer id0)
  {
    SetActiveRenderer_8(id0);
  }

  private native long GetActiveRenderer_9();
  public vtkRenderer GetActiveRenderer()
  {
    long temp = GetActiveRenderer_9();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInput_10(vtkRenderWindow id0);
  public void SetInput(vtkRenderWindow id0)
  {
    SetInput_10(id0);
  }

  private native long GetInput_11();
  public vtkRenderWindow GetInput()
  {
    long temp = GetInput_11();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStartWrite_12( Object id0, byte[] id1, int len1);
  public void SetStartWrite( Object id0, String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetStartWrite_12(id0, bytes1, bytes1.length);
  }

  private native void SetEndWrite_13( Object id0, byte[] id1, int len1);
  public void SetEndWrite( Object id0, String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetEndWrite_13(id0, bytes1, bytes1.length);
  }

  private native long GetMTime_14();
  public long GetMTime()
  {
    return GetMTime_14();
  }

  public vtkExporter() { super(); }

  public vtkExporter(long id) { super(id); }

}
