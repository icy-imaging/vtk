// java wrapper for vtkPDataSetWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPDataSetWriter extends vtkDataSetWriter
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

  private native int Write_4();
  public int Write()
  {
    return Write_4();
  }

  private native void SetNumberOfPieces_5(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_5(id0);
  }

  private native int GetNumberOfPieces_6();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_6();
  }

  private native void SetGhostLevel_7(int id0);
  public void SetGhostLevel(int id0)
  {
    SetGhostLevel_7(id0);
  }

  private native int GetGhostLevel_8();
  public int GetGhostLevel()
  {
    return GetGhostLevel_8();
  }

  private native void SetStartPiece_9(int id0);
  public void SetStartPiece(int id0)
  {
    SetStartPiece_9(id0);
  }

  private native int GetStartPiece_10();
  public int GetStartPiece()
  {
    return GetStartPiece_10();
  }

  private native void SetEndPiece_11(int id0);
  public void SetEndPiece(int id0)
  {
    SetEndPiece_11(id0);
  }

  private native int GetEndPiece_12();
  public int GetEndPiece()
  {
    return GetEndPiece_12();
  }

  private native void SetFilePattern_13(byte[] id0, int len0);
  public void SetFilePattern(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePattern_13(bytes0, bytes0.length);
  }

  private native byte[] GetFilePattern_14();
  public String GetFilePattern()
  {
    return new String(GetFilePattern_14(), StandardCharsets.UTF_8);
  }

  private native void SetUseRelativeFileNames_15(int id0);
  public void SetUseRelativeFileNames(int id0)
  {
    SetUseRelativeFileNames_15(id0);
  }

  private native int GetUseRelativeFileNames_16();
  public int GetUseRelativeFileNames()
  {
    return GetUseRelativeFileNames_16();
  }

  private native void UseRelativeFileNamesOn_17();
  public void UseRelativeFileNamesOn()
  {
    UseRelativeFileNamesOn_17();
  }

  private native void UseRelativeFileNamesOff_18();
  public void UseRelativeFileNamesOff()
  {
    UseRelativeFileNamesOff_18();
  }

  private native void SetController_19(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_19(id0);
  }

  private native long GetController_20();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_20();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPDataSetWriter() { super(); }

  public vtkPDataSetWriter(long id) { super(id); }
  public native long   VTKInit();

}
