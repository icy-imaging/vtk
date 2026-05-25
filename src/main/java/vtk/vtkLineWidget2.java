// java wrapper for vtkLineWidget2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLineWidget2 extends vtkAbstractWidget
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

  private native void SetRepresentation_5(vtkLineRepresentation id0);
  public void SetRepresentation(vtkLineRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  private native long GetLineRepresentation_6();
  public vtkLineRepresentation GetLineRepresentation()
  {
    long temp = GetLineRepresentation_6();

    if (temp == 0) return null;
    return (vtkLineRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_7();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_7();
  }

  private native void SetProcessEvents_8(int id0);
  public void SetProcessEvents(int id0)
  {
    SetProcessEvents_8(id0);
  }

  public vtkLineWidget2() { super(); }

  public vtkLineWidget2(long id) { super(id); }
  public native long   VTKInit();

}
