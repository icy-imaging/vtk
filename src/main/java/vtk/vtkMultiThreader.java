// java wrapper for vtkMultiThreader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiThreader extends vtkObject
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

  private native void SetNumberOfThreads_4(int id0);
  public void SetNumberOfThreads(int id0)
  {
    SetNumberOfThreads_4(id0);
  }

  private native int GetNumberOfThreadsMinValue_5();
  public int GetNumberOfThreadsMinValue()
  {
    return GetNumberOfThreadsMinValue_5();
  }

  private native int GetNumberOfThreadsMaxValue_6();
  public int GetNumberOfThreadsMaxValue()
  {
    return GetNumberOfThreadsMaxValue_6();
  }

  private native int GetNumberOfThreads_7();
  public int GetNumberOfThreads()
  {
    return GetNumberOfThreads_7();
  }

  private native int GetGlobalStaticMaximumNumberOfThreads_8();
  public int GetGlobalStaticMaximumNumberOfThreads()
  {
    return GetGlobalStaticMaximumNumberOfThreads_8();
  }

  private native void SetGlobalMaximumNumberOfThreads_9(int id0);
  public void SetGlobalMaximumNumberOfThreads(int id0)
  {
    SetGlobalMaximumNumberOfThreads_9(id0);
  }

  private native int GetGlobalMaximumNumberOfThreads_10();
  public int GetGlobalMaximumNumberOfThreads()
  {
    return GetGlobalMaximumNumberOfThreads_10();
  }

  private native void SetGlobalDefaultNumberOfThreads_11(int id0);
  public void SetGlobalDefaultNumberOfThreads(int id0)
  {
    SetGlobalDefaultNumberOfThreads_11(id0);
  }

  private native int GetGlobalDefaultNumberOfThreads_12();
  public int GetGlobalDefaultNumberOfThreads()
  {
    return GetGlobalDefaultNumberOfThreads_12();
  }

  private native void SingleMethodExecute_13();
  public void SingleMethodExecute()
  {
    SingleMethodExecute_13();
  }

  private native void MultipleMethodExecute_14();
  public void MultipleMethodExecute()
  {
    MultipleMethodExecute_14();
  }

  private native void TerminateThread_15(int id0);
  public void TerminateThread(int id0)
  {
    TerminateThread_15(id0);
  }

  private native int IsThreadActive_16(int id0);
  public int IsThreadActive(int id0)
  {
    return IsThreadActive_16(id0);
  }

  public vtkMultiThreader() { super(); }

  public vtkMultiThreader(long id) { super(id); }
  public native long   VTKInit();

}
