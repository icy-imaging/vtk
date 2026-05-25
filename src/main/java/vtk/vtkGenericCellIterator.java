// java wrapper for vtkGenericCellIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericCellIterator extends vtkObject
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

  private native void Begin_4();
  public void Begin()
  {
    Begin_4();
  }

  private native int IsAtEnd_5();
  public int IsAtEnd()
  {
    return IsAtEnd_5();
  }

  private native long NewCell_6();
  public vtkGenericAdaptorCell NewCell()
  {
    long temp = NewCell_6();

    if (temp == 0) return null;
    return (vtkGenericAdaptorCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_7(vtkGenericAdaptorCell id0);
  public void GetCell(vtkGenericAdaptorCell id0)
  {
    GetCell_7(id0);
  }

  private native long GetCell_8();
  public vtkGenericAdaptorCell GetCell()
  {
    long temp = GetCell_8();

    if (temp == 0) return null;
    return (vtkGenericAdaptorCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Next_9();
  public void Next()
  {
    Next_9();
  }

  public vtkGenericCellIterator() { super(); }

  public vtkGenericCellIterator(long id) { super(id); }

}
