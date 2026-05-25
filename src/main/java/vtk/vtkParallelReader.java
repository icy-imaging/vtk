// java wrapper for vtkParallelReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelReader extends vtkReaderAlgorithm
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

  private native int ReadMetaData_9(vtkInformation id0);
  public int ReadMetaData(vtkInformation id0)
  {
    return ReadMetaData_9(id0);
  }

  private native int ReadMesh_10(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_10(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_11(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_11(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_12(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_12(id0,id1,id2,id3,id4);
  }

  public vtkParallelReader() { super(); }

  public vtkParallelReader(long id) { super(id); }

}
