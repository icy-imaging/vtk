// java wrapper for vtkXMLParser object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLParser extends vtkObject
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

  private native long TellG_4();
  public long TellG()
  {
    return TellG_4();
  }

  private native void SeekG_5(long id0);
  public void SeekG(long id0)
  {
    SeekG_5(id0);
  }

  private native int Parse_6();
  public int Parse()
  {
    return Parse_6();
  }

  private native int Parse_7(byte[] id0, int len0);
  public int Parse(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Parse_7(bytes0, bytes0.length);
  }

  private native int Parse_8(byte[] id0, int len0,int id1);
  public int Parse(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Parse_8(bytes0, bytes0.length,id1);
  }

  private native int InitializeParser_9();
  public int InitializeParser()
  {
    return InitializeParser_9();
  }

  private native int ParseChunk_10(byte[] id0, int len0,int id1);
  public int ParseChunk(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ParseChunk_10(bytes0, bytes0.length,id1);
  }

  private native int CleanupParser_11();
  public int CleanupParser()
  {
    return CleanupParser_11();
  }

  private native void SetFileName_12(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_12(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_13();
  public String GetFileName()
  {
    return new String(GetFileName_13(), StandardCharsets.UTF_8);
  }

  private native void SetIgnoreCharacterData_14(int id0);
  public void SetIgnoreCharacterData(int id0)
  {
    SetIgnoreCharacterData_14(id0);
  }

  private native int GetIgnoreCharacterData_15();
  public int GetIgnoreCharacterData()
  {
    return GetIgnoreCharacterData_15();
  }

  private native void SetEncoding_16(byte[] id0, int len0);
  public void SetEncoding(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEncoding_16(bytes0, bytes0.length);
  }

  private native byte[] GetEncoding_17();
  public String GetEncoding()
  {
    return new String(GetEncoding_17(), StandardCharsets.UTF_8);
  }

  private native boolean hasLargeOffsets_18();
  public boolean hasLargeOffsets()
  {
    return hasLargeOffsets_18();
  }

  public vtkXMLParser() { super(); }

  public vtkXMLParser(long id) { super(id); }
  public native long   VTKInit();

}
