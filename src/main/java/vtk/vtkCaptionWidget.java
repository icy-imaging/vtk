// java wrapper for vtkCaptionWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCaptionWidget extends vtkBorderWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void SetRepresentation_5(vtkCaptionRepresentation id0);
  public void SetRepresentation(vtkCaptionRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  private native void SetCaptionActor2D_6(vtkCaptionActor2D id0);
  public void SetCaptionActor2D(vtkCaptionActor2D id0)
  {
    SetCaptionActor2D_6(id0);
  }

  private native long GetCaptionActor2D_7();
  public vtkCaptionActor2D GetCaptionActor2D()
  {
    long temp = GetCaptionActor2D_7();

    if (temp == 0) return null;
    return (vtkCaptionActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_8();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_8();
  }

  public vtkCaptionWidget() { super(); }

  public vtkCaptionWidget(long id) { super(id); }
  public native long   VTKInit();

}
