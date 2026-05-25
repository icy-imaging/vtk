// java wrapper for vtkDGCell object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDGCell extends vtkCellMetadata
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

  private native long GetCellSourceConnectivity_4(int id0);
  public vtkDataArray GetCellSourceConnectivity(int id0)
  {
    long temp = GetCellSourceConnectivity_4(id0);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellSourceNodalGhostMarks_5(int id0);
  public vtkDataArray GetCellSourceNodalGhostMarks(int id0)
  {
    long temp = GetCellSourceNodalGhostMarks_5(id0);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellSourceOffset_6(int id0);
  public long GetCellSourceOffset(int id0)
  {
    return GetCellSourceOffset_6(id0);
  }

  private native boolean GetCellSourceIsBlanked_7(int id0);
  public boolean GetCellSourceIsBlanked(int id0)
  {
    return GetCellSourceIsBlanked_7(id0);
  }

  private native int GetCellSourceShape_8(int id0);
  public int GetCellSourceShape(int id0)
  {
    return GetCellSourceShape_8(id0);
  }

  private native int GetCellSourceSideType_9(int id0);
  public int GetCellSourceSideType(int id0)
  {
    return GetCellSourceSideType_9(id0);
  }

  private native int GetCellSourceSelectionType_10(int id0);
  public int GetCellSourceSelectionType(int id0)
  {
    return GetCellSourceSelectionType_10(id0);
  }

  private native long GetNumberOfCells_11();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_11();
  }

  private native void ShallowCopy_12(vtkCellMetadata id0);
  public void ShallowCopy(vtkCellMetadata id0)
  {
    ShallowCopy_12(id0);
  }

  private native void DeepCopy_13(vtkCellMetadata id0);
  public void DeepCopy(vtkCellMetadata id0)
  {
    DeepCopy_13(id0);
  }

  private native int GetShapeCornerCount_14(int id0);
  public int GetShapeCornerCount(int id0)
  {
    return GetShapeCornerCount_14(id0);
  }

  private native int GetShapeDimension_15(int id0);
  public int GetShapeDimension(int id0)
  {
    return GetShapeDimension_15(id0);
  }

  private native int GetShape_16();
  public int GetShape()
  {
    return GetShape_16();
  }

  private native int GetDimension_17();
  public int GetDimension()
  {
    return GetDimension_17();
  }

  private native int GetNumberOfCorners_18();
  public int GetNumberOfCorners()
  {
    return GetNumberOfCorners_18();
  }

  private native int GetNumberOfSideTypes_19();
  public int GetNumberOfSideTypes()
  {
    return GetNumberOfSideTypes_19();
  }

  private native int[] GetSideRangeForSideType_20(int id0);
  public int[] GetSideRangeForSideType(int id0)
  {
    return GetSideRangeForSideType_20(id0);
  }

  private native int[] GetSideRangeForSideDimension_21(int id0);
  public int[] GetSideRangeForSideDimension(int id0)
  {
    return GetSideRangeForSideDimension_21(id0);
  }

  private native int GetNumberOfSidesOfDimension_22(int id0);
  public int GetNumberOfSidesOfDimension(int id0)
  {
    return GetNumberOfSidesOfDimension_22(id0);
  }

  private native int GetSideShape_23(int id0);
  public int GetSideShape(int id0)
  {
    return GetSideShape_23(id0);
  }

  private native int GetSideTypeForShape_24(int id0);
  public int GetSideTypeForShape(int id0)
  {
    return GetSideTypeForShape_24(id0);
  }

  private native long GetReferencePoints_25();
  public vtkTypeFloat32Array GetReferencePoints()
  {
    long temp = GetReferencePoints_25();

    if (temp == 0) return null;
    return (vtkTypeFloat32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideConnectivity_26();
  public vtkTypeInt32Array GetSideConnectivity()
  {
    long temp = GetSideConnectivity_26();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideOffsetsAndShapes_27();
  public vtkTypeInt32Array GetSideOffsetsAndShapes()
  {
    long temp = GetSideOffsetsAndShapes_27();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void FillReferencePoints_28(vtkTypeFloat32Array id0);
  public void FillReferencePoints(vtkTypeFloat32Array id0)
  {
    FillReferencePoints_28(id0);
  }

  private native void FillSideConnectivity_29(vtkTypeInt32Array id0);
  public void FillSideConnectivity(vtkTypeInt32Array id0)
  {
    FillSideConnectivity_29(id0);
  }

  private native void FillSideOffsetsAndShapes_30(vtkTypeInt32Array id0);
  public void FillSideOffsetsAndShapes(vtkTypeInt32Array id0)
  {
    FillSideOffsetsAndShapes_30(id0);
  }

  public vtkDGCell() { super(); }

  public vtkDGCell(long id) { super(id); }

}
