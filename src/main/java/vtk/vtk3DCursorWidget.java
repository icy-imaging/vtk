// java wrapper for vtk3DCursorWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtk3DCursorWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtk3DCursorRepresentation id0);
  public void SetRepresentation(vtk3DCursorRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native long Get3DCursorRepresentation_5();
  public vtk3DCursorRepresentation Get3DCursorRepresentation()
  {
    long temp = Get3DCursorRepresentation_5();

    if (temp == 0) return null;
    return (vtk3DCursorRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_6();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_6();
  }

  public vtk3DCursorWidget() { super(); }

  public vtk3DCursorWidget(long id) { super(id); }
  public native long   VTKInit();

}
