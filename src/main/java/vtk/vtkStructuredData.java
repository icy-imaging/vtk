// java wrapper for vtkStructuredData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredData extends vtkObject
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

  private native int SetDimensions_4(int id0[],int id1[]);
  public int SetDimensions(int id0[],int id1[])
  {
    return SetDimensions_4(id0,id1);
  }

  private native int SetExtent_5(int id0[],int id1[]);
  public int SetExtent(int id0[],int id1[])
  {
    return SetExtent_5(id0,id1);
  }

  private native int GetDataDescription_6(int id0[]);
  public int GetDataDescription(int id0[])
  {
    return GetDataDescription_6(id0);
  }

  private native int GetDataDescriptionFromExtent_7(int id0[]);
  public int GetDataDescriptionFromExtent(int id0[])
  {
    return GetDataDescriptionFromExtent_7(id0);
  }

  private native int GetDataDimension_8(int id0);
  public int GetDataDimension(int id0)
  {
    return GetDataDimension_8(id0);
  }

  private native int GetDataDimension_9(int id0[]);
  public int GetDataDimension(int id0[])
  {
    return GetDataDimension_9(id0);
  }

  private native long GetNumberOfPoints_10(int id0[],int id1);
  public long GetNumberOfPoints(int id0[],int id1)
  {
    return GetNumberOfPoints_10(id0,id1);
  }

  private native long GetNumberOfCells_11(int id0[],int id1);
  public long GetNumberOfCells(int id0[],int id1)
  {
    return GetNumberOfCells_11(id0,id1);
  }

  private native void GetCellExtentFromPointExtent_12(int id0[],int id1[],int id2);
  public void GetCellExtentFromPointExtent(int id0[],int id1[],int id2)
  {
    GetCellExtentFromPointExtent_12(id0,id1,id2);
  }

  private native void GetDimensionsFromExtent_13(int id0[],int id1[],int id2);
  public void GetDimensionsFromExtent(int id0[],int id1[],int id2)
  {
    GetDimensionsFromExtent_13(id0,id1,id2);
  }

  private native boolean IsPointVisible_14(long id0,vtkUnsignedCharArray id1);
  public boolean IsPointVisible(long id0,vtkUnsignedCharArray id1)
  {
    return IsPointVisible_14(id0,id1);
  }

  private native boolean IsCellVisible_15(long id0,int id1[],int id2,vtkUnsignedCharArray id3,vtkUnsignedCharArray id4);
  public boolean IsCellVisible(long id0,int id1[],int id2,vtkUnsignedCharArray id3,vtkUnsignedCharArray id4)
  {
    return IsCellVisible_15(id0,id1,id2,id3,id4);
  }

  private native void GetCellDimensionsFromExtent_16(int id0[],int id1[],int id2);
  public void GetCellDimensionsFromExtent(int id0[],int id1[],int id2)
  {
    GetCellDimensionsFromExtent_16(id0,id1,id2);
  }

  private native void GetCellDimensionsFromPointDimensions_17(int id0[],int id1[]);
  public void GetCellDimensionsFromPointDimensions(int id0[],int id1[])
  {
    GetCellDimensionsFromPointDimensions_17(id0,id1);
  }

  private native void GetLocalStructuredCoordinates_18(int id0[],int id1[],int id2[],int id3);
  public void GetLocalStructuredCoordinates(int id0[],int id1[],int id2[],int id3)
  {
    GetLocalStructuredCoordinates_18(id0,id1,id2,id3);
  }

  private native void GetGlobalStructuredCoordinates_19(int id0[],int id1[],int id2[],int id3);
  public void GetGlobalStructuredCoordinates(int id0[],int id1[],int id2[],int id3)
  {
    GetGlobalStructuredCoordinates_19(id0,id1,id2,id3);
  }

  private native void GetCellPoints_20(long id0,vtkIdList id1,int id2,int id3[]);
  public void GetCellPoints(long id0,vtkIdList id1,int id2,int id3[])
  {
    GetCellPoints_20(id0,id1,id2,id3);
  }

  private native void GetPointCells_21(long id0,vtkIdList id1,int id2[]);
  public void GetPointCells(long id0,vtkIdList id1,int id2[])
  {
    GetPointCells_21(id0,id1,id2);
  }

  private native void GetCellNeighbors_22(long id0,vtkIdList id1,vtkIdList id2,int id3[]);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2,int id3[])
  {
    GetCellNeighbors_22(id0,id1,id2,id3);
  }

  private native void GetCellNeighbors_23(long id0,vtkIdList id1,vtkIdList id2,int id3[],int id4[]);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2,int id3[],int id4[])
  {
    GetCellNeighbors_23(id0,id1,id2,id3,id4);
  }

  private native long ComputePointIdForExtent_24(int id0[],int id1[],int id2);
  public long ComputePointIdForExtent(int id0[],int id1[],int id2)
  {
    return ComputePointIdForExtent_24(id0,id1,id2);
  }

  private native long ComputeCellIdForExtent_25(int id0[],int id1[],int id2);
  public long ComputeCellIdForExtent(int id0[],int id1[],int id2)
  {
    return ComputeCellIdForExtent_25(id0,id1,id2);
  }

  private native long ComputePointId_26(int id0[],int id1[],int id2);
  public long ComputePointId(int id0[],int id1[],int id2)
  {
    return ComputePointId_26(id0,id1,id2);
  }

  private native long ComputeCellId_27(int id0[],int id1[],int id2);
  public long ComputeCellId(int id0[],int id1[],int id2)
  {
    return ComputeCellId_27(id0,id1,id2);
  }

  private native void ComputeCellStructuredCoordsForExtent_28(long id0,int id1[],int id2[],int id3);
  public void ComputeCellStructuredCoordsForExtent(long id0,int id1[],int id2[],int id3)
  {
    ComputeCellStructuredCoordsForExtent_28(id0,id1,id2,id3);
  }

  private native void ComputeCellStructuredCoords_29(long id0,int id1[],int id2[],int id3);
  public void ComputeCellStructuredCoords(long id0,int id1[],int id2[],int id3)
  {
    ComputeCellStructuredCoords_29(id0,id1,id2,id3);
  }

  private native void ComputeCellStructuredMinMaxCoords_30(long id0,int id1[],int id2[],int id3[],int id4);
  public void ComputeCellStructuredMinMaxCoords(long id0,int id1[],int id2[],int id3[],int id4)
  {
    ComputeCellStructuredMinMaxCoords_30(id0,id1,id2,id3,id4);
  }

  private native void ComputePointStructuredCoordsForExtent_31(long id0,int id1[],int id2[],int id3);
  public void ComputePointStructuredCoordsForExtent(long id0,int id1[],int id2[],int id3)
  {
    ComputePointStructuredCoordsForExtent_31(id0,id1,id2,id3);
  }

  private native void ComputePointStructuredCoords_32(long id0,int id1[],int id2[],int id3);
  public void ComputePointStructuredCoords(long id0,int id1[],int id2[],int id3)
  {
    ComputePointStructuredCoords_32(id0,id1,id2,id3);
  }

  public vtkStructuredData() { super(); }

  public vtkStructuredData(long id) { super(id); }

}
