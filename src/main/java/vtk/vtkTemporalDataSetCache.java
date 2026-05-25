// java wrapper for vtkTemporalDataSetCache object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalDataSetCache extends vtkAlgorithm
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

  private native void SetCacheSize_4(int id0);
  public void SetCacheSize(int id0)
  {
    SetCacheSize_4(id0);
  }

  private native int GetCacheSize_5();
  public int GetCacheSize()
  {
    return GetCacheSize_5();
  }

  private native void SetCacheInMemkind_6(boolean id0);
  public void SetCacheInMemkind(boolean id0)
  {
    SetCacheInMemkind_6(id0);
  }

  private native boolean GetCacheInMemkind_7();
  public boolean GetCacheInMemkind()
  {
    return GetCacheInMemkind_7();
  }

  private native void CacheInMemkindOn_8();
  public void CacheInMemkindOn()
  {
    CacheInMemkindOn_8();
  }

  private native void CacheInMemkindOff_9();
  public void CacheInMemkindOff()
  {
    CacheInMemkindOff_9();
  }

  private native void SetIsASource_10(boolean id0);
  public void SetIsASource(boolean id0)
  {
    SetIsASource_10(id0);
  }

  private native boolean GetIsASource_11();
  public boolean GetIsASource()
  {
    return GetIsASource_11();
  }

  private native void IsASourceOn_12();
  public void IsASourceOn()
  {
    IsASourceOn_12();
  }

  private native void IsASourceOff_13();
  public void IsASourceOff()
  {
    IsASourceOff_13();
  }

  public vtkTemporalDataSetCache() { super(); }

  public vtkTemporalDataSetCache(long id) { super(id); }
  public native long   VTKInit();

}
