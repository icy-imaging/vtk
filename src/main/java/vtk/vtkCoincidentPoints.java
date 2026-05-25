// java wrapper for vtkCoincidentPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCoincidentPoints extends vtkObject
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

  private native void AddPoint_4(long id0,double id1[]);
  public void AddPoint(long id0,double id1[])
  {
    AddPoint_4(id0,id1);
  }

  private native long GetCoincidentPointIds_5(double id0[]);
  public vtkIdList GetCoincidentPointIds(double id0[])
  {
    long temp = GetCoincidentPointIds_5(id0);

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNextCoincidentPointIds_6();
  public vtkIdList GetNextCoincidentPointIds()
  {
    long temp = GetNextCoincidentPointIds_6();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitTraversal_7();
  public void InitTraversal()
  {
    InitTraversal_7();
  }

  private native void RemoveNonCoincidentPoints_8();
  public void RemoveNonCoincidentPoints()
  {
    RemoveNonCoincidentPoints_8();
  }

  private native void Clear_9();
  public void Clear()
  {
    Clear_9();
  }

  private native void SpiralPoints_10(long id0,vtkPoints id1);
  public void SpiralPoints(long id0,vtkPoints id1)
  {
    SpiralPoints_10(id0,id1);
  }

  public vtkCoincidentPoints() { super(); }

  public vtkCoincidentPoints(long id) { super(id); }
  public native long   VTKInit();

}
