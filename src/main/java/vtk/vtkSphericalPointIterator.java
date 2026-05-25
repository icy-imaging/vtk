// java wrapper for vtkSphericalPointIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphericalPointIterator extends vtkObject
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

  private native void SetDataSet_4(vtkDataSet id0);
  public void SetDataSet(vtkDataSet id0)
  {
    SetDataSet_4(id0);
  }

  private native long GetDataSet_5();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxes_6(vtkDoubleArray id0);
  public void SetAxes(vtkDoubleArray id0)
  {
    SetAxes_6(id0);
  }

  private native long GetAxes_7();
  public vtkDoubleArray GetAxes()
  {
    long temp = GetAxes_7();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxes_8(int id0,int id1);
  public void SetAxes(int id0,int id1)
  {
    SetAxes_8(id0,id1);
  }

  private native void SetSorting_9(int id0);
  public void SetSorting(int id0)
  {
    SetSorting_9(id0);
  }

  private native int GetSortingMinValue_10();
  public int GetSortingMinValue()
  {
    return GetSortingMinValue_10();
  }

  private native int GetSortingMaxValue_11();
  public int GetSortingMaxValue()
  {
    return GetSortingMaxValue_11();
  }

  private native int GetSorting_12();
  public int GetSorting()
  {
    return GetSorting_12();
  }

  private native void SetSortTypeToNone_13();
  public void SetSortTypeToNone()
  {
    SetSortTypeToNone_13();
  }

  private native void SetSortTypeToAscending_14();
  public void SetSortTypeToAscending()
  {
    SetSortTypeToAscending_14();
  }

  private native void SetSortTypeToDescending_15();
  public void SetSortTypeToDescending()
  {
    SetSortTypeToDescending_15();
  }

  private native boolean Initialize_16(double id0[],vtkIdList id1);
  public boolean Initialize(double id0[],vtkIdList id1)
  {
    return Initialize_16(id0,id1);
  }

  private native boolean Initialize_17(double id0[]);
  public boolean Initialize(double id0[])
  {
    return Initialize_17(id0);
  }

  private native void GoToFirstPoint_18();
  public void GoToFirstPoint()
  {
    GoToFirstPoint_18();
  }

  private native boolean IsDoneWithTraversal_19();
  public boolean IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_19();
  }

  private native void GoToNextPoint_20();
  public void GoToNextPoint()
  {
    GoToNextPoint_20();
  }

  private native long GetCurrentPoint_21();
  public long GetCurrentPoint()
  {
    return GetCurrentPoint_21();
  }

  private native long GetPoint_22(int id0,int id1);
  public long GetPoint(int id0,int id1)
  {
    return GetPoint_22(id0,id1);
  }

  private native long GetNumberOfAxes_23();
  public long GetNumberOfAxes()
  {
    return GetNumberOfAxes_23();
  }

  private native void BuildRepresentation_24(vtkPolyData id0);
  public void BuildRepresentation(vtkPolyData id0)
  {
    BuildRepresentation_24(id0);
  }

  public vtkSphericalPointIterator() { super(); }

  public vtkSphericalPointIterator(long id) { super(id); }
  public native long   VTKInit();

}
