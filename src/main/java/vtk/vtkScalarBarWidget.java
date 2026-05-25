// java wrapper for vtkScalarBarWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScalarBarWidget extends vtkBorderWidget
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

  private native void SetRepresentation_4(vtkScalarBarRepresentation id0);
  public void SetRepresentation(vtkScalarBarRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native long GetScalarBarRepresentation_5();
  public vtkScalarBarRepresentation GetScalarBarRepresentation()
  {
    long temp = GetScalarBarRepresentation_5();

    if (temp == 0) return null;
    return (vtkScalarBarRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarBarActor_6(vtkScalarBarActor id0);
  public void SetScalarBarActor(vtkScalarBarActor id0)
  {
    SetScalarBarActor_6(id0);
  }

  private native long GetScalarBarActor_7();
  public vtkScalarBarActor GetScalarBarActor()
  {
    long temp = GetScalarBarActor_7();

    if (temp == 0) return null;
    return (vtkScalarBarActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRepositionable_8(int id0);
  public void SetRepositionable(int id0)
  {
    SetRepositionable_8(id0);
  }

  private native int GetRepositionable_9();
  public int GetRepositionable()
  {
    return GetRepositionable_9();
  }

  private native void RepositionableOn_10();
  public void RepositionableOn()
  {
    RepositionableOn_10();
  }

  private native void RepositionableOff_11();
  public void RepositionableOff()
  {
    RepositionableOff_11();
  }

  private native void CreateDefaultRepresentation_12();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_12();
  }

  private native int GetProcessEvents_13();
  public int GetProcessEvents()
  {
    return GetProcessEvents_13();
  }

  public vtkScalarBarWidget() { super(); }

  public vtkScalarBarWidget(long id) { super(id); }
  public native long   VTKInit();

}
