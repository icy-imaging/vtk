// java wrapper for vtkBiDimensionalWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBiDimensionalWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_5(vtkBiDimensionalRepresentation id0);
  public void SetRepresentation(vtkBiDimensionalRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  private native long GetBiDimensionalRepresentation_6();
  public vtkBiDimensionalRepresentation GetBiDimensionalRepresentation()
  {
    long temp = GetBiDimensionalRepresentation_6();

    if (temp == 0) return null;
    return (vtkBiDimensionalRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_7();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_7();
  }

  private native int IsMeasureValid_8();
  public int IsMeasureValid()
  {
    return IsMeasureValid_8();
  }

  private native void SetProcessEvents_9(int id0);
  public void SetProcessEvents(int id0)
  {
    SetProcessEvents_9(id0);
  }

  private native void SetWidgetStateToStart_10();
  public void SetWidgetStateToStart()
  {
    SetWidgetStateToStart_10();
  }

  private native void SetWidgetStateToManipulate_11();
  public void SetWidgetStateToManipulate()
  {
    SetWidgetStateToManipulate_11();
  }

  private native int GetWidgetState_12();
  public int GetWidgetState()
  {
    return GetWidgetState_12();
  }

  public vtkBiDimensionalWidget() { super(); }

  public vtkBiDimensionalWidget(long id) { super(id); }
  public native long   VTKInit();

}
