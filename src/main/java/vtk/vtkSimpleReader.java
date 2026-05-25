// java wrapper for vtkSimpleReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSimpleReader extends vtkReaderAlgorithm
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

  private native void AddFileName_4(byte[] id0, int len0);
  public void AddFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddFileName_4(bytes0, bytes0.length);
  }

  private native void ClearFileNames_5();
  public void ClearFileNames()
  {
    ClearFileNames_5();
  }

  private native int GetNumberOfFileNames_6();
  public int GetNumberOfFileNames()
  {
    return GetNumberOfFileNames_6();
  }

  private native byte[] GetFileName_7(int id0);
  public String GetFileName(int id0)
  {
    return new String(GetFileName_7(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCurrentFileName_8();
  public String GetCurrentFileName()
  {
    return new String(GetCurrentFileName_8(), StandardCharsets.UTF_8);
  }

  private native int ReadTimeDependentMetaData_9(int id0,vtkInformation id1);
  public int ReadTimeDependentMetaData(int id0,vtkInformation id1)
  {
    return ReadTimeDependentMetaData_9(id0,id1);
  }

  private native int ReadMetaData_10(vtkInformation id0);
  public int ReadMetaData(vtkInformation id0)
  {
    return ReadMetaData_10(id0);
  }

  private native int ReadMesh_11(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_11(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_12(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_12(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_13(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_13(id0,id1,id2,id3,id4);
  }

  private native double GetTimeValue_14(byte[] id0, int len0);
  public double GetTimeValue(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetTimeValue_14(bytes0, bytes0.length);
  }

  private native int ReadMetaDataSimple_15(byte[] id0, int len0,vtkInformation id1);
  public int ReadMetaDataSimple(String id0,vtkInformation id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadMetaDataSimple_15(bytes0, bytes0.length,id1);
  }

  private native int ReadMeshSimple_16(byte[] id0, int len0,vtkDataObject id1);
  public int ReadMeshSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadMeshSimple_16(bytes0, bytes0.length,id1);
  }

  private native int ReadPointsSimple_17(byte[] id0, int len0,vtkDataObject id1);
  public int ReadPointsSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadPointsSimple_17(bytes0, bytes0.length,id1);
  }

  private native int ReadArraysSimple_18(byte[] id0, int len0,vtkDataObject id1);
  public int ReadArraysSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadArraysSimple_18(bytes0, bytes0.length,id1);
  }

  public vtkSimpleReader() { super(); }

  public vtkSimpleReader(long id) { super(id); }

}
