// java wrapper for vtkCellGridCopyQuery object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridCopyQuery extends vtkCellGridQuery
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

  private native boolean Initialize_4();
  public boolean Initialize()
  {
    return Initialize_4();
  }

  private native boolean Finalize_5();
  public boolean Finalize()
  {
    return Finalize_5();
  }

  private native void SetSource_6(vtkCellGrid id0);
  public void SetSource(vtkCellGrid id0)
  {
    SetSource_6(id0);
  }

  private native long GetSource_7();
  public vtkCellGrid GetSource()
  {
    long temp = GetSource_7();

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTarget_8(vtkCellGrid id0);
  public void SetTarget(vtkCellGrid id0)
  {
    SetTarget_8(id0);
  }

  private native long GetTarget_9();
  public vtkCellGrid GetTarget()
  {
    long temp = GetTarget_9();

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetCopyCellTypes_10();
  public int GetCopyCellTypes()
  {
    return GetCopyCellTypes_10();
  }

  private native void SetCopyCellTypes_11(int id0);
  public void SetCopyCellTypes(int id0)
  {
    SetCopyCellTypes_11(id0);
  }

  private native void CopyCellTypesOn_12();
  public void CopyCellTypesOn()
  {
    CopyCellTypesOn_12();
  }

  private native void CopyCellTypesOff_13();
  public void CopyCellTypesOff()
  {
    CopyCellTypesOff_13();
  }

  private native int GetCopyCells_14();
  public int GetCopyCells()
  {
    return GetCopyCells_14();
  }

  private native void SetCopyCells_15(int id0);
  public void SetCopyCells(int id0)
  {
    SetCopyCells_15(id0);
  }

  private native void CopyCellsOn_16();
  public void CopyCellsOn()
  {
    CopyCellsOn_16();
  }

  private native void CopyCellsOff_17();
  public void CopyCellsOff()
  {
    CopyCellsOff_17();
  }

  private native int GetCopyOnlyShape_18();
  public int GetCopyOnlyShape()
  {
    return GetCopyOnlyShape_18();
  }

  private native void SetCopyOnlyShape_19(int id0);
  public void SetCopyOnlyShape(int id0)
  {
    SetCopyOnlyShape_19(id0);
  }

  private native void CopyOnlyShapeOn_20();
  public void CopyOnlyShapeOn()
  {
    CopyOnlyShapeOn_20();
  }

  private native void CopyOnlyShapeOff_21();
  public void CopyOnlyShapeOff()
  {
    CopyOnlyShapeOff_21();
  }

  private native int GetCopyArrays_22();
  public int GetCopyArrays()
  {
    return GetCopyArrays_22();
  }

  private native void SetCopyArrays_23(int id0);
  public void SetCopyArrays(int id0)
  {
    SetCopyArrays_23(id0);
  }

  private native void CopyArraysOn_24();
  public void CopyArraysOn()
  {
    CopyArraysOn_24();
  }

  private native void CopyArraysOff_25();
  public void CopyArraysOff()
  {
    CopyArraysOff_25();
  }

  private native int GetCopyArrayValues_26();
  public int GetCopyArrayValues()
  {
    return GetCopyArrayValues_26();
  }

  private native void SetCopyArrayValues_27(int id0);
  public void SetCopyArrayValues(int id0)
  {
    SetCopyArrayValues_27(id0);
  }

  private native void CopyArrayValuesOn_28();
  public void CopyArrayValuesOn()
  {
    CopyArrayValuesOn_28();
  }

  private native void CopyArrayValuesOff_29();
  public void CopyArrayValuesOff()
  {
    CopyArrayValuesOff_29();
  }

  private native int GetDeepCopyArrays_30();
  public int GetDeepCopyArrays()
  {
    return GetDeepCopyArrays_30();
  }

  private native void SetDeepCopyArrays_31(int id0);
  public void SetDeepCopyArrays(int id0)
  {
    SetDeepCopyArrays_31(id0);
  }

  private native void DeepCopyArraysOn_32();
  public void DeepCopyArraysOn()
  {
    DeepCopyArraysOn_32();
  }

  private native void DeepCopyArraysOff_33();
  public void DeepCopyArraysOff()
  {
    DeepCopyArraysOff_33();
  }

  private native int GetCopySchema_34();
  public int GetCopySchema()
  {
    return GetCopySchema_34();
  }

  private native void SetCopySchema_35(int id0);
  public void SetCopySchema(int id0)
  {
    SetCopySchema_35(id0);
  }

  private native void CopySchemaOn_36();
  public void CopySchemaOn()
  {
    CopySchemaOn_36();
  }

  private native void CopySchemaOff_37();
  public void CopySchemaOff()
  {
    CopySchemaOff_37();
  }

  private native boolean AddSourceCellAttributeId_38(int id0);
  public boolean AddSourceCellAttributeId(int id0)
  {
    return AddSourceCellAttributeId_38(id0);
  }

  private native boolean RemoveSourceCellAttributeId_39(int id0);
  public boolean RemoveSourceCellAttributeId(int id0)
  {
    return RemoveSourceCellAttributeId_39(id0);
  }

  private native boolean AddAllSourceCellAttributeIds_40();
  public boolean AddAllSourceCellAttributeIds()
  {
    return AddAllSourceCellAttributeIds_40();
  }

  private native void GetCellAttributeIds_41(vtkIdList id0);
  public void GetCellAttributeIds(vtkIdList id0)
  {
    GetCellAttributeIds_41(id0);
  }

  private native void ResetCellAttributeIds_42();
  public void ResetCellAttributeIds()
  {
    ResetCellAttributeIds_42();
  }

  public vtkCellGridCopyQuery() { super(); }

  public vtkCellGridCopyQuery(long id) { super(id); }
  public native long   VTKInit();

}
