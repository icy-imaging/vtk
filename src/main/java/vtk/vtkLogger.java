// java wrapper for vtkLogger object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLogger extends vtkObjectBase
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

  private native void Init_4();
  public void Init()
  {
    Init_4();
  }

  private native void SetStderrVerbosity_5(int id0);
  public void SetStderrVerbosity(int id0)
  {
    SetStderrVerbosity_5(id0);
  }

  private native void SetInternalVerbosityLevel_6(int id0);
  public void SetInternalVerbosityLevel(int id0)
  {
    SetInternalVerbosityLevel_6(id0);
  }

  private native void LogToFile_7(byte[] id0, int len0,int id1,int id2);
  public void LogToFile(String id0,int id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    LogToFile_7(bytes0, bytes0.length,id1,id2);
  }

  private native void EndLogToFile_8(byte[] id0, int len0);
  public void EndLogToFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    EndLogToFile_8(bytes0, bytes0.length);
  }

  private native void SetThreadName_9(byte[] id0, int len0);
  public void SetThreadName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetThreadName_9(bytes0, bytes0.length);
  }

  private native byte[] GetThreadName_10();
  public String GetThreadName()
  {
    return new String(GetThreadName_10(), StandardCharsets.UTF_8);
  }

  private native byte[] GetIdentifier_11(vtkObjectBase id0);
  public String GetIdentifier(vtkObjectBase id0)
  {
    return new String(GetIdentifier_11(id0), StandardCharsets.UTF_8);
  }

  private native boolean RemoveCallback_12(byte[] id0, int len0);
  public boolean RemoveCallback(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return RemoveCallback_12(bytes0, bytes0.length);
  }

  private native boolean IsEnabled_13();
  public boolean IsEnabled()
  {
    return IsEnabled_13();
  }

  private native int GetCurrentVerbosityCutoff_14();
  public int GetCurrentVerbosityCutoff()
  {
    return GetCurrentVerbosityCutoff_14();
  }

  private native int ConvertToVerbosity_15(int id0);
  public int ConvertToVerbosity(int id0)
  {
    return ConvertToVerbosity_15(id0);
  }

  private native int ConvertToVerbosity_16(byte[] id0, int len0);
  public int ConvertToVerbosity(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ConvertToVerbosity_16(bytes0, bytes0.length);
  }

  private native void Log_17(int id0,byte[] id1, int len1,int id2,byte[] id3, int len3);
  public void Log(int id0,String id1,int id2,String id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    Log_17(id0,bytes1, bytes1.length,id2,bytes3, bytes3.length);
  }

  private native void StartScope_18(int id0,byte[] id1, int len1,byte[] id2, int len2,int id3);
  public void StartScope(int id0,String id1,String id2,int id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    StartScope_18(id0,bytes1, bytes1.length,bytes2, bytes2.length,id3);
  }

  private native void EndScope_19(byte[] id0, int len0);
  public void EndScope(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    EndScope_19(bytes0, bytes0.length);
  }

  public vtkLogger() { super(); }

  public vtkLogger(long id) { super(id); }

}
