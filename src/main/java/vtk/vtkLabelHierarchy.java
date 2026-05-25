// java wrapper for vtkLabelHierarchy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabelHierarchy extends vtkPointSet
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

  private native void SetPoints_4(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_4(id0);
  }

  private native void ComputeHierarchy_5();
  public void ComputeHierarchy()
  {
    ComputeHierarchy_5();
  }

  private native void SetTargetLabelCount_6(int id0);
  public void SetTargetLabelCount(int id0)
  {
    SetTargetLabelCount_6(id0);
  }

  private native int GetTargetLabelCount_7();
  public int GetTargetLabelCount()
  {
    return GetTargetLabelCount_7();
  }

  private native void SetMaximumDepth_8(int id0);
  public void SetMaximumDepth(int id0)
  {
    SetMaximumDepth_8(id0);
  }

  private native int GetMaximumDepth_9();
  public int GetMaximumDepth()
  {
    return GetMaximumDepth_9();
  }

  private native void SetTextProperty_10(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_10(id0);
  }

  private native long GetTextProperty_11();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_11();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPriorities_12(vtkDataArray id0);
  public void SetPriorities(vtkDataArray id0)
  {
    SetPriorities_12(id0);
  }

  private native long GetPriorities_13();
  public vtkDataArray GetPriorities()
  {
    long temp = GetPriorities_13();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabels_14(vtkAbstractArray id0);
  public void SetLabels(vtkAbstractArray id0)
  {
    SetLabels_14(id0);
  }

  private native long GetLabels_15();
  public vtkAbstractArray GetLabels()
  {
    long temp = GetLabels_15();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOrientations_16(vtkDataArray id0);
  public void SetOrientations(vtkDataArray id0)
  {
    SetOrientations_16(id0);
  }

  private native long GetOrientations_17();
  public vtkDataArray GetOrientations()
  {
    long temp = GetOrientations_17();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIconIndices_18(vtkIntArray id0);
  public void SetIconIndices(vtkIntArray id0)
  {
    SetIconIndices_18(id0);
  }

  private native long GetIconIndices_19();
  public vtkIntArray GetIconIndices()
  {
    long temp = GetIconIndices_19();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSizes_20(vtkDataArray id0);
  public void SetSizes(vtkDataArray id0)
  {
    SetSizes_20(id0);
  }

  private native long GetSizes_21();
  public vtkDataArray GetSizes()
  {
    long temp = GetSizes_21();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBoundedSizes_22(vtkDataArray id0);
  public void SetBoundedSizes(vtkDataArray id0)
  {
    SetBoundedSizes_22(id0);
  }

  private native long GetBoundedSizes_23();
  public vtkDataArray GetBoundedSizes()
  {
    long temp = GetBoundedSizes_23();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NewIterator_24(int id0,vtkRenderer id1,vtkCamera id2,double id3[],boolean id4,float id5[]);
  public vtkLabelHierarchyIterator NewIterator(int id0,vtkRenderer id1,vtkCamera id2,double id3[],boolean id4,float id5[])
  {
    long temp = NewIterator_24(id0,id1,id2,id3,id4,id5);

    if (temp == 0) return null;
    return (vtkLabelHierarchyIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetDiscreteNodeCoordinatesFromWorldPoint_25(int id0[],double id1[],int id2);
  public void GetDiscreteNodeCoordinatesFromWorldPoint(int id0[],double id1[],int id2)
  {
    GetDiscreteNodeCoordinatesFromWorldPoint_25(id0,id1,id2);
  }

  private native long GetNumberOfCells_26();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_26();
  }

  private native long GetCell_27(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_27(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_28(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_28(id0,id1);
  }

  private native int GetCellType_29(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_29(id0);
  }

  private native void GetCellPoints_30(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_30(id0,id1);
  }

  private native void GetPointCells_31(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_31(id0,id1);
  }

  private native int GetMaxCellSize_32();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_32();
  }

  private native long GetCenterPts_33();
  public vtkPoints GetCenterPts()
  {
    long temp = GetCenterPts_33();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCoincidentPoints_34();
  public vtkCoincidentPoints GetCoincidentPoints()
  {
    long temp = GetCoincidentPoints_34();

    if (temp == 0) return null;
    return (vtkCoincidentPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetAnchorFrustumPlanes_35(double id0[],vtkRenderer id1,vtkCoordinate id2);
  public void GetAnchorFrustumPlanes(double id0[],vtkRenderer id1,vtkCoordinate id2)
  {
    GetAnchorFrustumPlanes_35(id0,id1,id2);
  }

  private native long GetCell_36(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_36(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkLabelHierarchy() { super(); }

  public vtkLabelHierarchy(long id) { super(id); }
  public native long   VTKInit();

}
