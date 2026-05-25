// java wrapper for vtkTextWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextWidget extends vtkBorderWidget
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

  private native void SetRepresentation_4(vtkTextRepresentation id0);
  public void SetRepresentation(vtkTextRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native void SetTextActor_5(vtkTextActor id0);
  public void SetTextActor(vtkTextActor id0)
  {
    SetTextActor_5(id0);
  }

  private native long GetTextActor_6();
  public vtkTextActor GetTextActor()
  {
    long temp = GetTextActor_6();

    if (temp == 0) return null;
    return (vtkTextActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_7();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_7();
  }

  public vtkTextWidget() { super(); }

  public vtkTextWidget(long id) { super(id); }
  public native long   VTKInit();

}
