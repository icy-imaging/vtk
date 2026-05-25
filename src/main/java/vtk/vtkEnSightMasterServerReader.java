// java wrapper for vtkEnSightMasterServerReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEnSightMasterServerReader extends vtkGenericEnSightReader
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

  private native int DetermineFileName_4(int id0);
  public int DetermineFileName(int id0)
  {
    return DetermineFileName_4(id0);
  }

  private native byte[] GetPieceCaseFileName_5();
  public String GetPieceCaseFileName()
  {
    return new String(GetPieceCaseFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetCurrentPiece_6(int id0);
  public void SetCurrentPiece(int id0)
  {
    SetCurrentPiece_6(id0);
  }

  private native int GetCurrentPiece_7();
  public int GetCurrentPiece()
  {
    return GetCurrentPiece_7();
  }

  private native int CanReadFile_8(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_8(bytes0, bytes0.length);
  }

  public vtkEnSightMasterServerReader() { super(); }

  public vtkEnSightMasterServerReader(long id) { super(id); }
  public native long   VTKInit();

}
