// java wrapper for vtkXMLPDataObjectWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLPDataObjectWriter extends vtkXMLWriter
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

  private native void SetNumberOfPieces_4(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_4(id0);
  }

  private native int GetNumberOfPieces_5();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_5();
  }

  private native void SetStartPiece_6(int id0);
  public void SetStartPiece(int id0)
  {
    SetStartPiece_6(id0);
  }

  private native int GetStartPiece_7();
  public int GetStartPiece()
  {
    return GetStartPiece_7();
  }

  private native void SetEndPiece_8(int id0);
  public void SetEndPiece(int id0)
  {
    SetEndPiece_8(id0);
  }

  private native int GetEndPiece_9();
  public int GetEndPiece()
  {
    return GetEndPiece_9();
  }

  private native void SetGhostLevel_10(int id0);
  public void SetGhostLevel(int id0)
  {
    SetGhostLevel_10(id0);
  }

  private native int GetGhostLevel_11();
  public int GetGhostLevel()
  {
    return GetGhostLevel_11();
  }

  private native void SetUseSubdirectory_12(boolean id0);
  public void SetUseSubdirectory(boolean id0)
  {
    SetUseSubdirectory_12(id0);
  }

  private native boolean GetUseSubdirectory_13();
  public boolean GetUseSubdirectory()
  {
    return GetUseSubdirectory_13();
  }

  private native void SetWriteSummaryFile_14(int id0);
  public void SetWriteSummaryFile(int id0)
  {
    SetWriteSummaryFile_14(id0);
  }

  private native int GetWriteSummaryFile_15();
  public int GetWriteSummaryFile()
  {
    return GetWriteSummaryFile_15();
  }

  private native void WriteSummaryFileOn_16();
  public void WriteSummaryFileOn()
  {
    WriteSummaryFileOn_16();
  }

  private native void WriteSummaryFileOff_17();
  public void WriteSummaryFileOff()
  {
    WriteSummaryFileOff_17();
  }

  private native void SetController_18(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_18(id0);
  }

  private native long GetController_19();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_19();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkXMLPDataObjectWriter() { super(); }

  public vtkXMLPDataObjectWriter(long id) { super(id); }

}
