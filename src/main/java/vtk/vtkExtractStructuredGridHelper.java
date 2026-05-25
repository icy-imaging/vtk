// java wrapper for vtkExtractStructuredGridHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractStructuredGridHelper extends vtkObject
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

  private native int[] GetOutputWholeExtent_4();
  public int[] GetOutputWholeExtent()
  {
    return GetOutputWholeExtent_4();
  }

  private native void Initialize_5(int id0[],int id1[],int id2[],boolean id3);
  public void Initialize(int id0[],int id1[],int id2[],boolean id3)
  {
    Initialize_5(id0,id1,id2,id3);
  }

  private native boolean IsValid_6();
  public boolean IsValid()
  {
    return IsValid_6();
  }

  private native int GetSize_7(int id0);
  public int GetSize(int id0)
  {
    return GetSize_7(id0);
  }

  private native int GetMappedIndex_8(int id0,int id1);
  public int GetMappedIndex(int id0,int id1)
  {
    return GetMappedIndex_8(id0,id1);
  }

  private native int GetMappedIndexFromExtentValue_9(int id0,int id1);
  public int GetMappedIndexFromExtentValue(int id0,int id1)
  {
    return GetMappedIndexFromExtentValue_9(id0,id1);
  }

  private native int GetMappedExtentValue_10(int id0,int id1);
  public int GetMappedExtentValue(int id0,int id1)
  {
    return GetMappedExtentValue_10(id0,id1);
  }

  private native int GetMappedExtentValueFromIndex_11(int id0,int id1);
  public int GetMappedExtentValueFromIndex(int id0,int id1)
  {
    return GetMappedExtentValueFromIndex_11(id0,id1);
  }

  private native void ComputeBeginAndEnd_12(int id0[],int id1[],int id2[],int id3[]);
  public void ComputeBeginAndEnd(int id0[],int id1[],int id2[],int id3[])
  {
    ComputeBeginAndEnd_12(id0,id1,id2,id3);
  }

  private native void CopyPointsAndPointData_13(int id0[],int id1[],vtkPointData id2,vtkPoints id3,vtkPointData id4,vtkPoints id5);
  public void CopyPointsAndPointData(int id0[],int id1[],vtkPointData id2,vtkPoints id3,vtkPointData id4,vtkPoints id5)
  {
    CopyPointsAndPointData_13(id0,id1,id2,id3,id4,id5);
  }

  private native void CopyCellData_14(int id0[],int id1[],vtkCellData id2,vtkCellData id3);
  public void CopyCellData(int id0[],int id1[],vtkCellData id2,vtkCellData id3)
  {
    CopyCellData_14(id0,id1,id2,id3);
  }

  private native void GetPartitionedVOI_15(int id0[],int id1[],int id2[],boolean id3,int id4[]);
  public void GetPartitionedVOI(int id0[],int id1[],int id2[],boolean id3,int id4[])
  {
    GetPartitionedVOI_15(id0,id1,id2,id3,id4);
  }

  private native void GetPartitionedOutputExtent_16(int id0[],int id1[],int id2[],int id3[],boolean id4,int id5[]);
  public void GetPartitionedOutputExtent(int id0[],int id1[],int id2[],int id3[],boolean id4,int id5[])
  {
    GetPartitionedOutputExtent_16(id0,id1,id2,id3,id4,id5);
  }

  public vtkExtractStructuredGridHelper() { super(); }

  public vtkExtractStructuredGridHelper(long id) { super(id); }
  public native long   VTKInit();

}
